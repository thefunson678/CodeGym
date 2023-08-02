package ss06_inheritance_polymorphism.practice;

public class Square extends Rectangle {
    public Square() {

    }
    public Square(double side, String color, boolean filled){
        super(color,filled,side,side);
    }
    public Square(double side) {
        super(side,side);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    public Square(String color, boolean filled) {
        super(color, filled);
    }

    public Square(double width, double height) {
        super(width, height);
    }

    public Square(String color, boolean filled, double width, double height) {
        super(color, filled, width, height);
    }
}
