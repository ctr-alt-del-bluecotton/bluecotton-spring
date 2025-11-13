package com.app.bluecotton.mapper;

import com.app.bluecotton.domain.vo.chat.ChatVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChatMapper {
    public void insert(ChatVO chatVO);
    public ChatVO selectChatById(Long id);
    public List<ChatVO> selectChatList();
    public void delete(ChatVO chatVO);
}
