package ss06_inheritance_polymorphism.excercise.ex06_1_Cycle_Cylinder;

public class Cycle {
    private double radius;
    private String color;

    public Cycle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Cycle() {
        this.radius = 1.0;
        this.color = "grade";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "Cycle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
