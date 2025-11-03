package com.app.bluecotton.domain.vo.post;

import lombok.Data;

import java.util.Date;

@Data
public class PostCommentVO {
    private Long id;
    private String postCommentContent;
    private Date postCommentCreateAt;
    private Long postId;
    private Long memberId;
}
