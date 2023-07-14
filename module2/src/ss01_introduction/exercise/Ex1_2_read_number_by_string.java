package ss01_introduction.exercise;
import java.util.Scanner;
public class Ex1_2_read_number_by_string {

    public static void main(String[] args) {
        String  read_text = "";
        int num_in;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num_in = Integer.parseInt(input.nextLine());
        if (num_in >= 100 || num_in < 0) {
            System.out.println("Result: Out of ability!");
        } else if ( num_in < 10) {
            switch (num_in) {
                case 0:
                    read_text = "Zero";
                    break;
                case 1:
                    read_text = "One";
                    break;
                case 2:
                    read_text = "Two";
                    break;
                case 3:
                    read_text = "Three";
                    break;
                case 4:
                    read_text = "Four";
                    break;
                case 5:
                    read_text = "Five";
                    break;
                case 6:
                    read_text = "Six";
                    break;
                case 7:
                    read_text = "Seven";
                    break;
                case 8:
                    read_text = "Eight";
                    break;
                case 9:
                    read_text = "Nine";
                    break;
                default:
                    read_text = "Unknow!";
                    break;
            }
        } else if (num_in < 20) {
            switch (num_in % 10) {
                case 0:
                    read_text = "Ten";
                    break;
                case 1:
                    read_text = "Eleven";
                    break;
                case 2:
                    read_text = "Twelve";
                    break;
                case 3:
                    read_text = "Thirteen";
                    break;
                case 4:
                    read_text = "Fourteen";
                    break;
                case 5:
                    read_text = "Fifteen";
                    break;
                case 6:
                    read_text = "Sixteen";
                    break;
                case 7:
                    read_text = "Seventeen";
                    break;
                case 8:
                    read_text = "Eightteen";
                    break;
                case 9:
                    read_text = "Nineteen";
                    break;
                default:
                    read_text = "Unknow!";
                    break;
            }
        } else {
            switch (num_in/10) {
                case 1:
                    read_text = "Ten";
                    break;
                case 2:
                    read_text = "Twenty";
                    break;
                case 3:
                    read_text = "Thirty";
                    break;
                case 4:
                    read_text = "Fourty";
                    break;
                case 5:
                    read_text = "Fifty";
                    break;
                case 6:
                    read_text = "Sixty";
                    break;
                case 7:
                    read_text = "Seventy";
                    break;
                case 8:
                    read_text = "Eighty";
                    break;
                case 9:
                    read_text = "Ninety";
                    break;
                default:
                    read_text = "Unknow!";
                    break;
            }
            switch (num_in % 10) {
                case 0:
                    read_text += "";
                    break;
                case 1:
                    read_text += " one";
                    break;
                case 2:
                    read_text += " two";
                    break;
                case 3:
                    read_text += " three";
                    break;
                case 4:
                    read_text += " four";
                    break;
                case 5:
                    read_text += " five";
                    break;
                case 6:
                    read_text += " six";
                    break;
                case 7:
                    read_text += " seven";
                    break;
                case 8:
                    read_text += " eight";
                    break;
                case 9:
                    read_text += " nine";
                    break;
                default:
                    read_text += "Unknow!";
                    break;
            }
        }
        System.out.println(read_text);
    }
}
