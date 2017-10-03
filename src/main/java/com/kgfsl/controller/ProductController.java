package com.kgfsl.controller;

import com.kgfsl.entity.Product;
import com.kgfsl.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
@CrossOrigin(origins = "http://127.0.0.1:5500", maxAge = 3000)
public class ProductController {

    private final ProductRepository productRepository;

    @Autowired
    public ProductController(@Qualifier("productRepository") ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping("test")
    public String test( ) {
        return "Hello World";
    }

    @RequestMapping(value = "products", method = RequestMethod.GET)
    public List <Product> productList( ) {
        return this.productRepository.findAll();
    }
}
