package com.codedecode.order.service;

import com.codedecode.order.dto.OrderDTO;
import com.codedecode.order.dto.OrderDTOFromFrontend;

public interface OrderService {

    public OrderDTO saveOrder(OrderDTOFromFrontend orderDetails);

}
