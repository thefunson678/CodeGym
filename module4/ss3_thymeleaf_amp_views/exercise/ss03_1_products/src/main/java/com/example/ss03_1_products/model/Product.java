package com.example.ss03_1_products.model;

import java.time.LocalDate;

public class Product {
    private Integer id;
    private String name;
    private Double price;
    private String description;
    private Boolean banHet;
    private String expressDate;

    public Product() {
    }

    public Product(Integer id, String name, Double price, String description, Boolean banHet, String expressDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.banHet = banHet;
        this.expressDate = expressDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getBanHet() {
        return banHet;
    }

    public void setBanHet(Boolean banHet) {
        this.banHet = banHet;
    }

    public String getExpressDate() {
        return expressDate;
    }

    public void setExpressDate(String expressDate) {
        this.expressDate = expressDate;
    }
}
