package com.app.bluecotton.domain.vo.shop;

import lombok.Data;

@Data
public class ProductReviewImageVO {
    private Long id;
    private String productReviewImagePath;
    private String productReviewImageName;
    private Long productReviewId;
}
