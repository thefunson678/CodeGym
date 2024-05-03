package com.example.ss03_1_products.repository;

import com.example.ss03_1_products.model.Product;

import java.util.List;

public interface IProductRepository {

    List<Product> getAllList();

    Integer getNewID();

    void save(Product product);

    void deleteByID(Integer id);
}
