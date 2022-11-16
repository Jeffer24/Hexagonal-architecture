package com.example.services.samplehexagonal.infra.inputport;

import java.math.BigDecimal;

import com.example.services.samplehexagonal.Orders;

public interface OrdersInputPort {
    public Orders createOrder(String customerId, BigDecimal total);
}
