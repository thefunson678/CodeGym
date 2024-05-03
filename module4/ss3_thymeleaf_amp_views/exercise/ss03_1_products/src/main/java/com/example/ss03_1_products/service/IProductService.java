package com.example.ss03_1_products.service;

import com.example.ss03_1_products.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllList();

    Integer getNewID();

    void save(Product product);

    void deleteByID(Integer id);
}
