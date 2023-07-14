package ss02_loop.practice;
import java.util.Scanner;
public class P2_3_tim_uoc_chung_lon_nhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        a = Integer.parseInt(input.nextLine());
        System.out.print("Nhập số nguyên b: ");
        b = Integer.parseInt(input.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
