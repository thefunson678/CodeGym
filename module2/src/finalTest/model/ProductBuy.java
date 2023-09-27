package finalTest.model;

public class ProductBuy extends Product{
    private double priceBuy;
    private String cityBuy;
    private  double taxFeeBuy;

    public ProductBuy(int id, String codeUI, String name, double price, int quantity, String manufacturer, double priceBuy, String cityBuy, double taxFeeBuy) {
        super(id, codeUI, name, price, quantity, manufacturer);
        this.priceBuy = priceBuy;
        this.cityBuy = cityBuy;
        this.taxFeeBuy =taxFeeBuy;
    }

    public double getPriceBuy() {
        return priceBuy;
    }

    public void setPriceBuy(double priceBuy) {
        this.priceBuy = priceBuy;
    }

    public String getCityBuy() {
        return cityBuy;
    }

    public void setCityBuy(String cityBuy) {
        this.cityBuy = cityBuy;
    }

    public double getTaxFeeBuy() {
        return taxFeeBuy;
    }

    public void setTaxFeeBuy(double taxFeeBuy) {
        this.taxFeeBuy = taxFeeBuy;
    }

    @Override
    public void toProduct() {
        System.out.println("Product: " + super.getId() +
                ", " + super.getCodeUI() +
                ", " + super.getName() +
                ", " + super.getPrice() +
                ", " + super.getQuantity() +
                ", " + super.getManufacturer() +
                ", " + this.priceBuy +
                ", " + this.cityBuy +
                ", " + this.taxFeeBuy);
    }
}
