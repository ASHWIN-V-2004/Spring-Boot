package com.skillfirstlab.customerservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillfirstlab.customerservice.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
