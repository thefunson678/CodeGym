package finalTest.service;

import finalTest.model.Product;
import finalTest.model.ProductBuy;
import finalTest.repository.ProductRepositoryImp;

public class ProductModelImp implements IProductModel{
    private ProductRepositoryImp productRepositoryImp = new ProductRepositoryImp();


    @Override
    public void createProductBuy(ProductBuy productBuy) {
        productRepositoryImp.createProductBuy(productBuy);
    }

    @Override
    public void deleteByCodeUI(String codeUI) {
        productRepositoryImp.deleteByCodeUI(codeUI);
    }

    @Override
    public void showProduct() {
        productRepositoryImp.showProduct();
    }

    @Override
    public void findbyName() {
        productRepositoryImp.findbyName();
    }

    @Override
    public void findByCodeUI() {
        productRepositoryImp.findbyName();
    }

    @Override
    public int getNewBuyID() {
        return productRepositoryImp.getNewBuyID();
    }


}
