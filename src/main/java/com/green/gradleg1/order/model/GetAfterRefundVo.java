package com.green.gradleg1.order.model;

import lombok.Data;

@Data
public class GetAfterRefundVo {
    private int completeFl;
    private String createdAt;
    private int iorder; // 주문번호
    String productPic;
    int productCnt;
    int price;
}
