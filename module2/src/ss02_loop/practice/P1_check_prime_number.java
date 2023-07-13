package ss02_loop.practice;
import java.util.Scanner;
public class P1_check_prime_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = Integer.parseInt(scanner.nextLine());
        //kiem tra so nguyen to
        if (number <= 1){
            System.out.println("Số " + number + " Không phải số nguyên tố!");
        } else if (number == 2 || number == 3) {
            System.out.println("Số " + number + " là số nguyên tố!");
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    System.out.println("Số " + number + " Không phải số nguyên tố!");
                    break;
                } else {
                    if (i == number / 2) {
                        System.out.println("Số " + number + " là số nguyên tố!");
                        break;
                    }
                }
            }
        }
    }
}
