package ss15_exception_debug.practice;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class P15_1_LinearEquationResolver {

    public static void main(String[] args) {

        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;
        try {
            System.out.print("a: ");
            a = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Không xác định được số nhập vào!");
        }catch (Exception e){
            System.out.println("Không xác định được số nhập vào 2!");
        } finally{
            System.out.println("");
        }

        try {
            System.out.print("b: ");
            b = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Không xác định được số a!");
        }catch (Exception e){
            System.out.println("Không xác định được số a 2!");
        } finally{
            System.out.println("");
        }
        if (a != 0) {
                double solution = -b / a;
                System.out.printf("The solution is: %f!", solution);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
