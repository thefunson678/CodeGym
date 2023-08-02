package ss07_Abstract_class_Interface.practice.p7_1_Animal_interface_Edible;

public class Apple extends Fruit{

    @Override
    public String howtoEat() {
        return "Apple could be slided";
    }

    public Apple() {

    }

    @Override
    public String toString() {
        return "Apple{}";
    }
}
