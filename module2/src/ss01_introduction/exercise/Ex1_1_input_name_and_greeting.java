package ss01_introduction.exercise;
import java.util.Scanner;
public class Ex1_1_input_name_and_greeting {
    public static void main(String[] args) {
        String yourname;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        yourname = input.nextLine();
        System.out.println("Helo: " + yourname);
    }

}
