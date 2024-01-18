package com.green.gradleg1.order.model;

import lombok.Data;

@Data
public class GetAfterOrderDto {
    private int process_state;

    private String createdAt;

    private int idetails;

    private String productNm;

    private String productPic;

    private int Price;

}
