package ss07_Abstract_class_Interface.excercise.ex7_1_Resizeable_interface;

public class Circle implements IResizeable {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle() {
    }
    public double getArea(){
        return Math.PI * this.r * this.r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r + ", Area=" + getArea() +
                '}';
    }

    @Override
    public void resize(double precent) {
        this.r = Math.sqrt((getArea()+ getArea()*precent/100)/Math.PI);
    }
}
