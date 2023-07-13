package ss02_loop.exercise;
import java.util.Scanner;
public class Ex2_1_list_goemetry_menu {


    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Please enter the menu number: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                case 2:
                    System.out.println("Print the square triangle: top-left");
                    for (int i = 5; i>0; i--){
                        for (int j=i;j>0;j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Print the square triangle: top-right");
                    for (int i = 1; i<=5; i++){
                        for(int j=1;j<=5;j++) {
                            if (j>=i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("Print the square triangle: botton-left");
                    for (int i = 1; i<=5; i++){
                        for(int j=1;j<=5;j++) {
                            if (j<=i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }

                    System.out.println("Print the square triangle: botton-right");
                    for (int i = 5; i>=1; i--){
                        for(int j=1;j<=5;j++) {
                            if (j>=i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int i = 1; i<=5; i++){
                        for (int j = 1; i<=5; j++){
//                            System.out.print(" ".repeat());
                        }
                    }
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice! Please choice again");
            }
        }
    }
}
