package com.skillfirstlab.productservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.skillfirstlab.productservice.Entity.Product;
import com.skillfirstlab.productservice.Service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping
    public Product save(@RequestBody Product product) {
        return service.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) {
        return service.getProductById(id);
    }
}
