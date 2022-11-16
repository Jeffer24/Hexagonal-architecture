package com.example.services.samplehexagonal.infra.inputadapter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.services.samplehexagonal.domain.Customer;
import com.example.services.samplehexagonal.infra.inputport.CustomerInputPort;

@RestController
@RequestMapping(value = "customer")
public class CustomerApi {

    @Autowired
    CustomerInputPort customerInputPort;

    @PostMapping(value="create", produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer create(@RequestParam String name, @RequestParam String country){
        return customerInputPort.createCustomer(name, country);
    }

    @PostMapping(value="get", produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer get(@RequestParam String customerId){
        return customerInputPort.getById(customerId);
    }

    @PostMapping(value="getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> getAll(){
        return customerInputPort.getAll();
    }

}
