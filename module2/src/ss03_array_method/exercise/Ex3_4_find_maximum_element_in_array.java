package ss03_array_method.exercise;
import java.util.Scanner;
public class Ex3_4_find_maximum_element_in_array {
    public static void main(String[] args) {
        int arr[];
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter the Array size: ");
            size = Integer.parseInt(input.nextLine());
            if (size > 20 && size <= 0){
                System.out.println("Size does not exceed 20 and greater than 0");
            } else {
                arr = new int[size];
                for (int i = 0; i < size; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    arr[i] = Integer.parseInt(input.nextLine());
                }
                System.out.print("Array is: [");
                for (int i = 0; i < size; i++) {
                    if (i == size - 1) {
                        System.out.print(arr[i]);
                    } else {
                        System.out.print(arr[i] + ",");
                    }
                }
                System.out.print("]");
                System.out.println();
                System.out.println("Maximum element is: " + max(arr));
            }
        } while (size > 20 && size <= 0);
    }
    public static int max(int arr[]){
        int max =arr[0];
        for (int i = 0; i< arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
