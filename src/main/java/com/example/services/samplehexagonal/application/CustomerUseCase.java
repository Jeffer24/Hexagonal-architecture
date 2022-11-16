package com.example.services.samplehexagonal.application;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.services.samplehexagonal.domain.Customer;
import com.example.services.samplehexagonal.infra.inputport.CustomerInputPort;
import com.example.services.samplehexagonal.infra.outputport.EntityRepositoy;

@Component
public class CustomerUseCase implements CustomerInputPort {

    @Autowired
    EntityRepositoy entityRepositoy;

    @Override
    public Customer createCustomer(String name, String country) {
        Customer customer = Customer.builder()
            .id(UUID.randomUUID().toString())
            .name(name)
            .country(country)
            .build();
        
        return entityRepositoy.save(customer);
    }

    @Override
    public Customer getById(String customerId) {
        return entityRepositoy.getById(customerId, Customer.class);
    }

    @Override
    public List<Customer> getAll() {
        return entityRepositoy.getAll(Customer.class);
    }
    
}
