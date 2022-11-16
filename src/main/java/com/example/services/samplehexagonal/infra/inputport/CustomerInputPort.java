package com.example.services.samplehexagonal.infra.inputport;

import java.util.List;

import com.example.services.samplehexagonal.domain.Customer;

public interface CustomerInputPort {
    public Customer createCustomer(String name, String country);
    public Customer getById(String customerId);
    public List<Customer> getAll();
}
