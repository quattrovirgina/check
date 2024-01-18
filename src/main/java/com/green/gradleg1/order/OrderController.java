package com.green.gradleg1.order;

import com.green.gradleg1.common.ResVo;
import com.green.gradleg1.order.model.GetAfterRefundDto;
import com.green.gradleg1.order.model.GetAfterRefundVo;
import com.green.gradleg1.order.model.GetOrderDto;
import com.green.gradleg1.order.model.GetOrderVo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/order")
@Slf4j

public class OrderController {
    private final OrderService service;

    @GetMapping("/")
    public List<GetOrderVo> getorder(GetOrderDto dto) {
        return service.getOrder(dto);
    }

    @GetMapping
    public List<GetAfterRefundVo> getafterrefund(GetAfterRefundDto dto) {
        return service.AfterRefund(dto);
    }
}
