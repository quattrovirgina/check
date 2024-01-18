package com.green.gradleg1.order;

import com.green.gradleg1.order.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    int insOrder(InsOrderDto dto);
    // 주문 결제

    List<GetAfterOrderVo> getAfterOrder(GetAfterOrderDto dto);
    // 주문완료

    List<GetOrderVo> getOrder(GetOrderDto dto);
    // 주문내역

    List<GetAfterRefundVo> getAfterRefund(GetAfterRefundDto dto);

    int cancelOrder(CancelOrderDto dto);

    int refundOrder(RefundOrderDto dto);


}
