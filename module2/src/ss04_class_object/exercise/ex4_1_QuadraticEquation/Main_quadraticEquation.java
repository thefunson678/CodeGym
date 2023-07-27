package ss04_class_object.exercise.ex4_1_QuadraticEquation;
import java.util.Scanner;
public class Main_quadraticEquation {
    public static void main(String[] args) {
        double a, b, c, delta, root1, root2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Quadratic Equation: ax^2 + bx + c = 0 ");
        System.out.print("Enter number a: ");
        a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter number b: ");
        b = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter number c: ");
        c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation ptb2 = new QuadraticEquation(a, b, c);
        delta = ptb2.getDiscriminant();
        root1 = ptb2.getRoot1();
        root2 = ptb2.getRoot2();
        System.out.println("The Quadratic Equation is: " + a + "x^2 + " + b +"x + " +c + " = 0 ");
        if (delta < 0 ){
            System.out.println("This equation has no real root!");
        } else if (delta == 0){
            System.out.println("This equation has onece root: " + root1 );
        } else {
            System.out.println("This equation has two root: " + root1 + " and " + root2);
        }
    }
}
