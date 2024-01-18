package com.green.gradleg1.order.model;

import lombok.Data;

@Data
public class GetAfterOrderVo {

    int completeFl;

    int iorder;

    int product_pic;

    String productNm;

    int productCnt;

    int price;
}
