package ss07_Abstract_class_Interface.practice.p7_2_Comparable_interface;

import ss05_modifier_package_static.excercise.ex5_1_access_modifor.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    private boolean filled;
    public ComparableCircle(double radius) {
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color);
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public ComparableCircle(){    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius() > o.getRadius()){
            return 1;
        }

        if(getRadius() < o.getRadius()){
            return -1;
        }

        return 0;
    }
}
