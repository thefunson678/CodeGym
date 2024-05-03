package com.example.ss03_1_products.service.impl;

import com.example.ss03_1_products.model.Product;
import com.example.ss03_1_products.repository.IProductRepository;
import com.example.ss03_1_products.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public List<Product> getAllList() {
        return iProductRepository.getAllList();
    }

    @Override
    public Integer getNewID() {
        return iProductRepository.getNewID();
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void deleteByID(Integer id) {
        iProductRepository.deleteByID(id);
    }
}
