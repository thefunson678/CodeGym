package ss03_array_method.practice;
import java.util.Scanner;
public class P3_4_covert_temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("-----------------");
        System.out.println("Enter the menu:     ");
        int choice = Integer.parseInt(input.nextLine());
        double DegC =0.0;
        double DegF=0.0;
        switch (choice){
            case 1:
                System.out.println("Enter Fahrenheit:     ");
                DegF = Double.parseDouble(input.nextLine());
                System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(DegF));
            case 2:
                System.out.println("Enter Celsius:     ");
                DegC = Double.parseDouble(input.nextLine());
                System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(DegC));

            case 0:
                System.exit(0);
            default:
                System.out.println("Menu not has " + choice + "!");
        }
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
