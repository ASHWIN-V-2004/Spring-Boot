package com.skillfirstlab.customerservice.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerDto {

    private String customerName;
    private int productId;
    private int quantity;

    public CustomerDto() {
    }

}
