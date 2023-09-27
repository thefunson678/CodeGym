package finalTest.model;

public class ProductSell extends Product{
    private double priceSell;
    private String countryOder;

    public ProductSell(int id, String codeUI, String name, double price, int quantity, String manufacturer, double priceSell, String countryOder) {
        super(id, codeUI, name, price, quantity, manufacturer);
        this.priceSell = priceSell;
        this.countryOder = countryOder;
    }

    public double getPriceSell() {
        return priceSell;
    }

    public void setPriceSell(double priceSell) {
        this.priceSell = priceSell;
    }

    public String getCountryOder() {
        return countryOder;
    }

    public void setCountryOder(String countryOder) {
        this.countryOder = countryOder;
    }

    public void toProduct(){
        System.out.println("Product: " + super.getId() +
                ", " + super.getCodeUI() +
                ", " + super.getName() +
                ", " + super.getPrice() +
                ", " + super.getQuantity() +
                ", " + super.getManufacturer() +
                ", " + this.priceSell +
                ", " + this.countryOder);
    }
}
