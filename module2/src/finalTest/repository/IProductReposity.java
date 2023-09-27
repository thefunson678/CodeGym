package finalTest.repository;

import finalTest.model.Product;
import finalTest.model.ProductBuy;

public interface IProductReposity {
    void createProductBuy(ProductBuy productBuy);
    void deleteByCodeUI(String codeUI);
    void showProduct();
    void findbyName();
    void findByCodeUI();
    int getNewBuyID();
}
