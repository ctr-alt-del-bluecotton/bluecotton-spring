package com.app.bluecotton.domain.vo.post;

import lombok.Data;

import java.util.Date;

@Data
public class PostRecentVO {
    private Long id;
    private Date postRecentCreateAt;
    private Long postId;
    private Long memberId;
}
