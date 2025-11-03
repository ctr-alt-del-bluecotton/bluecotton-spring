package com.app.bluecotton.domain.vo.chat;

import lombok.Data;

import java.util.Date;

@Data
public class ChatMessageVO {
    private Long id;
    private String chatMessageContent;
    private Date chatMessageCreateAt;
    private Long chatId;
}