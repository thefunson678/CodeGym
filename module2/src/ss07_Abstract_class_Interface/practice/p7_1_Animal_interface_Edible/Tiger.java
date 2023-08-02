package ss07_Abstract_class_Interface.practice.p7_1_Animal_interface_Edible;

public class Tiger extends Animal{

    @Override
    public String makeSound() {
        return "Tiger: roarrrr";
    }

    public Tiger() {

    }

    @Override
    public String toString() {
        return "Tiger{}";
    }
}
