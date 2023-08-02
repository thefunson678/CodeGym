package ss07_Abstract_class_Interface.excercise.ex7_1_Resizeable_interface;

public class Rectangle implements IResizeable{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a) {
        this.a = a;
        this.b = a;
    }
    public Rectangle() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public double getArea(){
        return a*b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", Area=" + getArea() +
                '}';
    }

    @Override
    public void resize(double precent) {
        double b1RateA1 = b/a;
        this.a = Math.sqrt((getArea()+getArea()*precent/100)/b1RateA1);
        this.b = b1RateA1 * this.a;
    }
}
