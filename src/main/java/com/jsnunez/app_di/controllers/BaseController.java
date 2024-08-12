package com.jsnunez.app_di.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsnunez.app_di.models.Product;
import com.jsnunez.app_di.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api")  // This means URL's starting with /api will be mapped into this class

public class BaseController {

@Autowired
private ProductService serviceProduct;
@GetMapping
public List<Product> list(){
    return serviceProduct.findAll();
}

@GetMapping("/{id}")
public Product show(@PathVariable Long id){
    return serviceProduct.findById(id);
}
}



