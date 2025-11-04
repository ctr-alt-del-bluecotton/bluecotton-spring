package com.app.bluecotton.api.mypageapi;

import com.app.bluecotton.domain.dto.ApiResponseDTO;
import com.app.bluecotton.domain.vo.member.MemberVO;
import com.app.bluecotton.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/mypage/*")
public class MyPageApi {
    private final MemberService memberService;

    @GetMapping("/my-page")
    public ResponseEntity<ApiResponseDTO<Object>> myPage(@RequestParam(required = false) Long id){
        log.info("마이페이지를 조회합니다.");
        log.info("{}", memberService.getMemberById(id));
        if(id != null) {
            memberService.getMemberById(id);
        }
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponseDTO.of("마이페이지 정보를 조회했습니다"));
    }

    @PostMapping("/read-member")
    public ResponseEntity<ApiResponseDTO<Object>> memberAddress(){
        List<String> data = memberService.findALlMemberAddress();
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponseDTO.of("모든 회원의 주소를 조회했습니다", data));
    }
}
