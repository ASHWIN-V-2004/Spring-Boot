package com.skillfirstlab.customerservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String customerName;

    private int productId;

    private String productName;

    private double productPrice;

    private Double totalPrice;
    public Customer() {
    }

    public Customer(int customerId, String customerName, int productId, String productName, double productPrice) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

}
