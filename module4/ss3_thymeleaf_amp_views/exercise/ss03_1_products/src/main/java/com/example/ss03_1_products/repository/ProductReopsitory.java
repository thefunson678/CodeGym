package com.example.ss03_1_products.repository;

import com.example.ss03_1_products.model.Product;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductReopsitory implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {
        Product product = new Product(1, "Phone", 12356.00, "Màn hình siêu mỏng", false, LocalDate.now().toString());
        productList.add(product);
        Product product1 = new Product(2, "Phone", 1256.00, "Màn hình siêu mỏng", false, LocalDate.now().toString());
        productList.add(product1);
    }

    @Override
    public List<Product> getAllList() {
        return productList;
    }

    @Override
    public Integer getNewID() {
        Integer newId = 0;
        for (Product p : productList) {
            if (p.getId() >= newId) {
                newId = p.getId();
            }
        }
        return newId + 1;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public void deleteByID(Integer id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                productList.remove(p);
            }
        }
    }
}
