package ss06_inheritance_polymorphism.practice;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
//        this.setColor("red");
//        this.setFilled(true);
        this.radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return radius*2*Math.PI;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + "," +
                "color=" + this.getColor() + "," +
                "fill=" + this.isFilled() + "," +
                "Area=" + this.getArea() + "," +
                "Perimeter=" + this.getPerimeter() + "," +
                '}';
    }
}
