package com.skillfirstlab.productservice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillfirstlab.productservice.Entity.Product;
import com.skillfirstlab.productservice.Repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public Product save(Product product) {
        return repository.save(product);
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }
}