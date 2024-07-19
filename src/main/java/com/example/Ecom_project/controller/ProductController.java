package com.example.Ecom_project.controller;

import com.example.Ecom_project.model.Product;
import com.example.Ecom_project.repo.ProductRepo;
import com.example.Ecom_project.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
@CrossOrigin
public class ProductController {
    @Autowired
    ProductServices services;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return services.getAllProducts();
    }


}
