package com.jsnunez.app_di.repositories;

import java.util.List;

import com.jsnunez.app_di.models.Product;

public interface ProductRepository {
    List<Product> findAll();
    Product findById(Long id);
}
