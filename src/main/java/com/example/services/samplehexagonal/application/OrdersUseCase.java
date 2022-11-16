package com.example.services.samplehexagonal.application;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.services.samplehexagonal.Orders;
import com.example.services.samplehexagonal.infra.inputport.OrdersInputPort;
import com.example.services.samplehexagonal.infra.outputport.EntityRepositoy;

@Component
public class OrdersUseCase implements OrdersInputPort{
    
    @Autowired
    EntityRepositoy entityRepositoy;

    @Override
    public Orders createOrder(String customerId, BigDecimal total) {
        Orders orders = Orders.builder()
            .id(UUID.randomUUID().toString())
            .cutomerId(customerId)
            .total(total)
            .build();
        return entityRepositoy.save(orders);
    }
}
