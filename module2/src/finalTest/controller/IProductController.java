package finalTest.controller;

import finalTest.model.Product;
import finalTest.model.ProductBuy;

public interface IProductController {
    void createProductBuy(ProductBuy productBuy);
    void deleteByCodeUI(String codeUI);
    void showProduct();
    void findbyName();
    void findByCodeUI();
    int getNewBuyID();
}
