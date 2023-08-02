package ss06_inheritance_polymorphism.excercise.ex06_1_Cycle_Cylinder;

import ss07_Abstract_class_Interface.excercise.ex7_1_Resizeable_interface.Circle;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double r, double height) {
        super(r);
        this.height = height;
    }

    public Cylinder(double r) {
        super(r);
    }
    public Cylinder() {
        this.height = 1.0;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getR() +
                ",height=" + height +
                ",Area=" + getArea() +
                '}';
    }
}
