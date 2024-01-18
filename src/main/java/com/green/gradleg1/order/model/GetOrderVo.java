package com.green.gradleg1.order.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
// 주문내역 조회
public class GetOrderVo {
    @JsonIgnore
    int iorder;

    String product_nm;

    int product_cnt;

    int price;

    int refundFl;

    int ireview;

    int process_state;
}
