package ss06_inheritance_polymorphism.excercise.ex06_4_Triangle_class;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle.setSide(1.0,1.0,2.0);
        System.out.println(triangle);
        System.out.println("Area: " + triangle.getArea() + "Perimeter: " + triangle.getPerimeter());

        triangle.setSide(10,11,20);
        System.out.println(triangle);
        System.out.println("Area: " + triangle.getArea() + " Perimeter: " + triangle.getPerimeter());
    }
}
