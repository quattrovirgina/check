package com.green.gradleg1.order.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class InsOrderDto {
    private int iuser;

    private int iaddress;

    private String receiver;

    private String phone_number;

    private String email;

    private int iproduct;

    private int ipayment_option;

    private String delivery_request;




}
