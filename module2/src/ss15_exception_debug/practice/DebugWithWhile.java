package ss15_exception_debug.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DebugWithWhile {
    public static void main(String[] args) {
    int a = CommonUtil.inputToInteger("so a");
        int b = CommonUtil.inputToInteger("so b");

//        Scanner scan = new Scanner(System.in);
//        while (true) {
//
//            System.out.print("\nPlease enter two integers: ");
//            try {
//                int a = Integer.parseInt(scan.nextLine());
//                int b = scan.nextInt();
//                // Solution:
                System.out.println("a + b = " + (a + b));
                System.out.println("a - b = " + (a - b));
                System.out.println("a * b = " + (a * b));
                System.out.println("a / b = " + (a / b));
                System.out.println("a % b = " + (a % b));
                System.out.println("(a / b) * b + a % b = " + (a + (a % b)));
//            } catch (InputMismatchException exception) {
//                System.out.println("Are you trying to quit the program? (y/n) ");
//                scan.nextLine();
//                String inAnswer;
//                inAnswer = scan.nextLine();
//                if (inAnswer == "n") {
//                    continue;
//                } else if (inAnswer == "y") {
//                    break;
//                }
//            } finally {
//                continue;
//            }
//        }
    }
}
