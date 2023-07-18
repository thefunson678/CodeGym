package ss03_array_method.exercise;
import java.util.Scanner;
public class Ex3_3_merge_aray {
    public static void main(String[] args) {
        int arr1[] = new int[5];
        int arr2[] = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element in array 1.");
        for (int i= 0; i< arr1.length; i++){
            System.out.print("Array 1 element " + (i+1) + ": ");
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("----------");
        System.out.println("Enter element in array 2.");
        for (int i= 0; i< arr2.length; i++){
            System.out.print("Array 2 element " + (i+1) + ": ");
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }

        int arr3[] = new int[arr1.length + arr2.length];
        for (int i = 0; i< arr1.length; i++){
            arr3[i]= arr1[i];
        }
        for (int i = arr1.length; i< arr3.length; i++){
            arr3[i] = arr2[i - arr1.length];
        }
        System.out.println("----------------");
        System.out.print("Array after merge: ");
        for (int e: arr3){
                System.out.print(e + " ");
        }
    }
}
