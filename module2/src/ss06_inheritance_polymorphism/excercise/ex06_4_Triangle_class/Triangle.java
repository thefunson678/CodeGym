package ss06_inheritance_polymorphism.excercise.ex06_4_Triangle_class;

import ss06_inheritance_polymorphism.practice.Shape;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {
        super("green",true);
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(String color, boolean filled) {
        super(color, filled);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void setSide(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double[] getSide(){
        return new double[] {side1,side2,side3};
    }
    public double getArea(){
        if (isTriangle()) {
            double p = (side1+side2+side3)/2;
            // công thức Heron
            return Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));
        } else {
            return -1;
        }
    }
    public double getPerimeter(){
        if (isTriangle()) {
            return (side1+side2+side3);
        } else {
            return -1;
        }

    }

    @Override
    public String toString() {
        if (isTriangle()) {
            return "Triangle{" +
                    side1 +
                    ", " + side2 +
                    ", " + side3 +
                    ", color=" + getColor() +
                    ", filled=" + isFilled() +
                    '}';
        } else {
            return "The size of 3 sides cannot render a triangle.";
        }
    }
    private boolean isTriangle(){
        if ( (side1+side2) > side3 && (side2+side3) > side1 & (side1+side3) > side2 && side1>0 && side2>0 && side3>0) {
            return true;
        }else {
            return false;
        }
    }
}
