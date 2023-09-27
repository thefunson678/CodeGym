package finalTestPhone.model;

public class PhoneHand extends Phone{
    private String handCountry;
    private String handStatus;

    public PhoneHand(int id, String name, double price, int quantity, String manufacturer, String handCountry, String handStatus) {
        super(id, name, price, quantity, manufacturer);
        this.handCountry = handCountry;
        this.handStatus = handStatus;
    }
    public String getHandCountry() {
        return handCountry;
    }

    public void setHandCountry(String handCountry) {
        this.handCountry = handCountry;
    }

    public String getHandStatus() {
        return handStatus;
    }

    public void setHandStatus(String handStatus) {
        this.handStatus = handStatus;
    }

    @Override
    public void toPhone() {
        System.out.println("Hand Phone: " + this.getId() +
                "," + this.getName() +
                "," + this.getPrice() +
                "," + this.getQuantity() +
                "," + this.getManufacturer() +
                "," + this.getHandCountry() +
                "," + this.getHandStatus());
    }
}
