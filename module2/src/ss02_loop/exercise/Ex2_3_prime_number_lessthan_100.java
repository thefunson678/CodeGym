package ss02_loop.exercise;

public class Ex2_3_prime_number_lessthan_100 {
    public static void main(String[] args) {
        int first_num = 1;
        String list = "List prime number less than 100: [";
        do{
            first_num++;
            if (first_num == 2 || first_num == 3) {
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
                        list += first_num + ", ";
                }
            }
        } while (first_num  < 100);
        System.out.println((list + "]").replace(", ]","]" ));
    }
}
