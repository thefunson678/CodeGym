package ss01_introduction.exercise;
import java.util.Scanner;
public class Ex1_3_covert_vnd_usd {
    public static void main(String[] args) {
        int vnd_val = 0;
        double usd_val = 0.0;
        final double usdrate = 25000.0;
        Scanner input = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("Tỉ giá: 1 USD = " + usdrate + " vnđ");
        System.out.println("--------------");
        System.out.print("Nhập số tiền vnđ: ");
        vnd_val = Integer.parseInt(input.nextLine());
        usd_val = vnd_val/usdrate;
        System.out.println("Số tiền " + vnd_val + " vnđ tương đương " + usd_val + " USD");

    }
}
