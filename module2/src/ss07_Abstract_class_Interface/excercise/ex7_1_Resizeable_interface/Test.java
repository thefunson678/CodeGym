package ss07_Abstract_class_Interface.excercise.ex7_1_Resizeable_interface;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        double r=0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        r = Double.parseDouble(scanner.nextLine());
        Circle circle = new Circle(r);
        System.out.println(circle);
        System.out.print("Enter size percent of Circle: ");
        circle.resize(Double.parseDouble(scanner.nextLine()));
        System.out.println(circle);
        System.out.println("=-----------=");

        System.out.print("Enter Edge of square: ");
        double a = Double.parseDouble(scanner.nextLine());
        Square square = new Square(a);
        System.out.println(square);
        System.out.print("Enter size percent of Square: ");
        square.resize(Double.parseDouble(scanner.nextLine()));
        System.out.println(square);
        System.out.println("=-----------=");

        System.out.print("Enter width of Rectangle: ");
        double a1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter heght of Rectangle: ");
        double b1 = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(a1,b1);
        System.out.println(rectangle);
        System.out.print("Enter size percent of Rectangle: ");
        rectangle.resize(Double.parseDouble(scanner.nextLine()));
        System.out.println(rectangle);
    }
}
