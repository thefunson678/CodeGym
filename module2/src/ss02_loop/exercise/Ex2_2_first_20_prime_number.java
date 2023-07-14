package ss02_loop.exercise;
import java.util.Scanner;
public class Ex2_2_first_20_prime_number {
    public static void main(String[] args) {
        int count = 0;
        int first_num = 1;
        String list = "First 20 prime number: [";
        do{
            first_num++;
            if (first_num == 2 || first_num == 3) {
                count++;
                list += first_num + ", ";
            } else {
                boolean check = true;
                for (int i = 2; i <= Math.sqrt(first_num);i++){
                    if (first_num % i == 0){
                        check = false;
                        break;
                    }
                }
                if (check){
                    count++;
                    if (count < 20){
                        list += first_num + ",";
                    } else {
                        list += first_num + "]";
                    }
                }
            }
        } while (count < 20);
        System.out.println(list);
    }
}
