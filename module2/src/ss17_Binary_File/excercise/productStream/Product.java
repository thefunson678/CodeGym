package ss17_Binary_File.excercise.productStream;

import java.io.Serializable;

public class Product implements Serializable {
    private String idCode;
    private String name;
    private String manufacturer;
    private double price;
    private String otherNote;

    public Product() {

    }

    public Product(String idCode, String name, String manufacturer, double price, String otherNote) {
        this.idCode = idCode;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.otherNote = otherNote;
    }

    public Product(String idCode, String name, String manufacturer, double price) {
        this.idCode = idCode;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOtherNote() {
        return otherNote;
    }

    public void setOtherNote(String otherNote) {
        this.otherNote = otherNote;
    }

    public boolean emptyProduct(){
        return idCode == null;

//        if (this.idCode==null){
//            return false;
//        } else {
//            return true;
//        }
    }
    @Override
    public String toString() {
        return "Product{" +
                "idCode='" + idCode + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", otherNote='" + otherNote + '\'' +
                '}';
    }
}
