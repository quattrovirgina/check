package com.green.gradleg1.order;

import com.green.gradleg1.common.CookieUtils;
import com.green.gradleg1.common.ResVo;
import com.green.gradleg1.order.model.*;
import com.green.gradleg1.security.AuthenticationFacade;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Slf4j
@Service

public class OrderService {

    private final OrderMapper mapper;
    private final AuthenticationFacade authenticationFacade;
    private final CookieUtils cookieUtils;

    public InsOrderDto insorder(InsOrderDto dto) {
        dto.setIuser(authenticationFacade.getLoginUserPk());
        log.info("dto: {}", dto);
        int OrderAffectedRows = mapper.insOrder(dto);

        InsOrderDto Idto = new InsOrderDto();

        Idto.setIaddress(dto.getIaddress());

        Idto.setIproduct(dto.getIproduct());

        Idto.setEmail(dto.getEmail());

        Idto.setReceiver(dto.getReceiver());

        Idto.setPhone_number(dto.getPhone_number());

        Idto.setDelivery_request(dto.getDelivery_request());

        Idto.setIpayment_option(dto.getIpayment_option());

        return Idto;
    }

    public GetAfterOrderDto afterOrder(GetAfterOrderDto dto) {

    }

    public List<GetOrderVo> getOrder(GetOrderDto dto) {
        List<GetOrderVo> list = mapper.getOrder(dto);

        for(GetOrderVo dto2 : list) {

        }

        return list;
    }

    public List<GetAfterRefundVo> AfterRefund(GetAfterRefundDto dto) {

        return mapper.getAfterRefund(dto);
    }
}
