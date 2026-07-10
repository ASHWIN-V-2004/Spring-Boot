package com.skillfirstlab.customerservice.Service;

import com.skillfirstlab.customerservice.DTO.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.skillfirstlab.customerservice.DTO.CustomerDto;
import com.skillfirstlab.customerservice.Entity.Customer;
import com.skillfirstlab.customerservice.Repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CustomerRepository repository;

    public Customer saveCustomer(CustomerDto request){

        String url="http://localhost:8081/product/"+request.getProductId();

        ProductResponse dto=restTemplate.getForObject(url, ProductResponse.class);

        Customer customer = new Customer();
        if(dto != null) {
            customer.setProductId(request.getProductId());
            customer.setCustomerName(request.getCustomerName());
            customer.setProductName(dto.getName());
            customer.setProductPrice(dto.getPrice());
            double totalPrice = dto.getPrice() * request.getQuantity();
            customer.setTotalPrice(totalPrice);
        }
        return repository.save(customer);

    }

}
