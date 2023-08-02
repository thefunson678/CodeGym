package ss07_Abstract_class_Interface.excercise.ex7_1_Resizeable_interface;

public class Square implements IResizeable{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }

    public double getArea(){
        return a*a;
    }

    @Override
    public void resize(double precent) {
        a = Math.sqrt(getArea()+getArea()*precent/100);
    }
}
