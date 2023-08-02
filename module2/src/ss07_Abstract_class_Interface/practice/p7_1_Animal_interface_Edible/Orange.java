package ss07_Abstract_class_Interface.practice.p7_1_Animal_interface_Edible;

public class Orange extends Fruit{

    @Override
    public String howtoEat() {
        return "Orange could be juiced";
    }

    public Orange() {
    }

    @Override
    public String toString() {
        return "Orange{}";
    }
}
