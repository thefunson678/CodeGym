package ss05_modifier_package_static.excercise.ex5_1_access_modifor;

public class Circle {
    private double radius;
    private String color;

    public Circle(double r) {
        this.radius = r;
    }

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
