package ss03_array_method.practice;
import java.util.Scanner;
public class P3_5_find_min_in_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int arr[];
        do {
            System.out.print("Enter the size: ");
            size = Integer.parseInt(input.nextLine());
            if(size <= 0 && size > 20){
                System.out.println("Error. Size must between 1-20 element");
            }
        } while (size <= 0 && size > 20);
        arr =new  int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Enter the element " + (i+1) + ": ");
            arr[i]= Integer.parseInt(input.nextLine());
        }
        System.out.println("Array is:");
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length - 1){
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        int min=0;
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            if (i==0){
                min = arr[i];
            } else {
                if (min > arr[i]){
                    min = arr[i];
                }
            }
        }
        System.out.print("Number is minimum in array is: " + min);
    }
}
