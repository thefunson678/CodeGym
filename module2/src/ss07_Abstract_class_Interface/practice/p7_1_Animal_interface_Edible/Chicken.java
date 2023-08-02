package ss07_Abstract_class_Interface.practice.p7_1_Animal_interface_Edible;

public class Chicken extends Animal implements IEdible{

    @Override
    public String makeSound() {
        return "Chicken: oac-oac";
    }
    @Override
    public String howtoEat(){
        return "Can eat!";
    }

    public Chicken() {
    }

    @Override
    public String toString() {
        return "Chicken{}";
    }
}
