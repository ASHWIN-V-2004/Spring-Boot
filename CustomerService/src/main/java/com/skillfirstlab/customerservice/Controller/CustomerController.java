package com.skillfirstlab.customerservice.Controller;

import com.skillfirstlab.customerservice.DTO.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.skillfirstlab.customerservice.Entity.Customer;
import com.skillfirstlab.customerservice.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping("/save")
    public Customer saveCustomer(@RequestBody CustomerDto customer){

        return service.saveCustomer(customer);

    }

}