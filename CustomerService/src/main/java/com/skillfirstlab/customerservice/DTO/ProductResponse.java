package com.skillfirstlab.customerservice.DTO;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponse {
    private int productId;
    private String name;
    private double price;
}