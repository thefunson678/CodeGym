package finalTestPhone.model;

public class PhoneAuthentic extends Phone{
    private int granYear;
    private String granCountry;

    public PhoneAuthentic(int id, String name, double price, int quantity, String manufacturer, int granYear, String granCountry) {
        super(id, name, price, quantity, manufacturer);
        this.granYear = granYear;
        this.granCountry = granCountry;
    }

    public int getGranYear() {
        return granYear;
    }

    public void setGranYear(int granYear) {
        this.granYear = granYear;
    }

    public String getGranCountry() {
        return granCountry;
    }

    public void setGranCountry(String granCountry) {
        this.granCountry = granCountry;
    }

    @Override
    public void toPhone() {
        System.out.println("Authentic Phone: " + this.getId() +
                "," + this.getName() +
                "," + this.getPrice() +
                "," + this.getQuantity() +
                "," + this.getManufacturer() +
                "," + this.getGranYear() +
                "," + this.granCountry);
    }
}
