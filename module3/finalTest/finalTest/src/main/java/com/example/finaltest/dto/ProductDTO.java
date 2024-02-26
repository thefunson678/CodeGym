package com.example.finaltest.dto;

public class ProductDTO {
    private Integer product_No;
    private Integer product_id;
    private String product_name;
    private Double product_price;
    private Integer product_quantity;
    private String product_color;
    private String product_category;

    public ProductDTO() {
    }

    public ProductDTO(Integer product_No, Integer product_id, String product_name, Double product_price, Integer product_quantity, String product_color, String product_category) {
        this.product_No = product_No;
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_quantity = product_quantity;
        this.product_color = product_color;
        this.product_category = product_category;
    }

    public ProductDTO(Integer product_No, String product_name, Double product_price, Integer product_quantity, String product_color, String product_category) {
        this.product_No = product_No;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_quantity = product_quantity;
        this.product_color = product_color;
        this.product_category = product_category;
    }

    public Integer getProduct_No() {
        return product_No;
    }

    public void setProduct_No(Integer product_No) {
        this.product_No = product_No;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Double product_price) {
        this.product_price = product_price;
    }

    public Integer getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(Integer product_quantity) {
        this.product_quantity = product_quantity;
    }

    public String getProduct_color() {
        return product_color;
    }

    public void setProduct_color(String product_color) {
        this.product_color = product_color;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }
}
