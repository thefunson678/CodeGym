package ss04_class_object.exercise.ex4_3_Fan_class;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public String toString(){
        if (this.on){
            return "Fan (speed: " + this.speed + ", color: " + this.color + ", radius: " + this.radius + "). Fan is on!";
        } else {
            return "Fan (color: " + this.color + ", radius: " + this.radius + "). Fan is on!";
        }
    }
}
