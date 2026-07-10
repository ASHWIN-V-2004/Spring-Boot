package com.skillfirstlab.productservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillfirstlab.productservice.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
