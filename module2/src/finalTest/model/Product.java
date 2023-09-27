package finalTest.model;

public abstract class Product {
    private int id;
    private String codeUI;
    private String name;
    private double price;
    private int quantity;
    private String manufacturer;

    public Product(int id, String codeUI, String name, double price, int quantity, String manufacturer) {
        this.id = id;
        this.codeUI = codeUI;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeUI() {
        return codeUI;
    }

    public void setCodeUI(String codeUI) {
        this.codeUI = codeUI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public abstract void toProduct();
}
