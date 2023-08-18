package ss12_map.exercise.ex12_1_product_arraylist;

class Product {
    private int idProduct;
    private String nameProduct;
    private double priceProduct;

    public Product(int idProduct, String nameProduct, double priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }
    public Product() {

    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProuct(int idProuct) {
        this.idProduct = idProuct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProuct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }
}
