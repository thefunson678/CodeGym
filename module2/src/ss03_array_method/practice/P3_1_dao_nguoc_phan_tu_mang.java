package ss03_array_method.practice;
import java.sql.Array;
import java.util.Scanner;
public class P3_1_dao_nguoc_phan_tu_mang {
    public static void main(String[] args) {
        int arr[];
        int num_element;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Array size: ");
            num_element = Integer.parseInt(input.nextLine());
            if (num_element > 20 && num_element <= 0){
                System.out.println("Size does not exceed 20");
            } else {
                arr = new int[num_element];
                for (int i = 0; i < num_element; i++){
                    System.out.print("Enter element " + (i+1) + ": ");
                    arr[i]= Integer.parseInt(input.nextLine());
                }
                // print array
                System.out.print("Array is: [");
                for (int i = 0; i < num_element; i++){
                    if (i == num_element - 1){
                        System.out.print(arr[i]);
                    } else {
                        System.out.print(arr[i] +  ",");
                    }
                }
                System.out.print("]");
                System.out.println();
                // hoan doi
                int arr2[];
                arr2 = new int[arr.length];
                for (int i =0; i < arr.length; i++){
                    arr2[arr.length-1-i] = arr[i];
                }
                //in mang sau hoan doi
                System.out.print("Array is: [");
                for (int i = 0; i < arr2.length; i++){
                    if (i ==arr2.length - 1){
                        System.out.print(arr2[i]);
                    } else {
                        System.out.print(arr2[i] +  ",");
                    }
                }
                System.out.print("]");

            }
        } while (num_element > 20 && num_element <= 0);





    }

}
