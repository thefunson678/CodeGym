package ss03_array_method.exercise;
import java.util.Scanner;
public class Ex3_2_add_elelment_to_array {
    public static void main(String[] args) {
        int arr[];
        arr = new  int[] {0,0,0,0,0,0,0,0,0,0};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index want insert: ");
        int index =  Integer.parseInt(input.nextLine());
        if (index <= 1 || index  >= arr.length-1){
            System.out.println("Can not insert!");
        } else{
            System.out.print("Enter the value want insert: ");
            int newele = Integer.parseInt(input.nextLine());
            arr[index] = newele;
            System.out.print("Array after insert: ");
            for (int e:arr) {
                    System.out.print(e + " ");
            }
        }

    }
}
