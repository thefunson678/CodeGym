package ss02_loop.practice;
import java.util.Scanner;
public class P2_calculate_money_interest_profit {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi: ");
        money = Double.parseDouble(input.nextLine());
        System.out.print("Nhập số tháng gửi tiền: ");
        month = Integer.parseInt(input.nextLine());
        System.out.print("Nhập lãi xuất (%/năm): ");
        interestRate = Double.parseDouble(input.nextLine());
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
