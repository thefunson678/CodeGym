package ss03_array_method.exercise;
import java.util.Scanner;
public class Ex3_1_delete_element_in_array {
    public static void main(String[] args) {
        int arr1[];
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter the Array size: ");
            size = Integer.parseInt(input.nextLine());
            if (size > 20 || size <= 0){
                System.out.println("Size does not exceed 20 and greater than 0");
            } else {
                arr1 = new int[size];
                for (int i = 0; i < size; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    arr1[i] = Integer.parseInt(input.nextLine());
                }
                System.out.print("]");
                System.out.println();
                System.out.println("Menu");
                System.out.println("1. Delete element by Index");
                System.out.println("2. Delete element by element name");
                System.out.println("0. Exit");
                System.out.println("-------------");
                System.out.print("Array before is: ");
                for (int i = 0; i < size; i++) {
                    if (i == size - 1) {
                        System.out.print(arr1[i]);
                    } else {
                        System.out.print(arr1[i] + ",");
                    }
                }
                System.out.println();
                System.out.print("Enter your menu: ");
                int choice;
                choice = Integer.parseInt(input.nextLine());
                int idelete;
                switch (choice){
                    case 1:
                        System.out.print("Enter index want delete: ");
                        idelete = Integer.parseInt(input.nextLine());
                        if (idelete >=0 && idelete < arr1.length) {
                            deleteIndex(idelete, arr1);
                        } else {
                            System.out.print("Out of index!");
                        }
                        break;

                    case 2:
                        System.out.print("Enter the element want to delete: ");
                        int ele = Integer.parseInt(input.nextLine());
                        if (isElement(ele, arr1) != -1) {
                            deleteIndex(isElement(ele, arr1), arr1);
                        } else {
                            System.out.print("Out of element!");
                        }
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.print("Out of system!");
                }
            }
        } while ((size > 20) || (size <= 0));
    }
    public static int isElement(int ele, int arr[]){
        for (int i = 0; i< arr.length; i++){
            if (ele == arr[i]){
                return i;
            } else {
                if (i == arr.length - 1){
                    return -1;
                }
            }
        }
        return -1;
    }
    public static void deleteIndex(int index, int[] arr){
        int arr2[];
        arr2 = new int[arr.length - 1];
        int j;
        System.out.print("After delete: ");
        for (int i=0; i < arr.length ; i++){
            if (i < index){
                j = i;
                arr2[j]=arr[i];
            } else if (i == index) {
                continue;
            } else {
                j = i-1;
                arr2[j]=arr[i];
            }
        }
        for (int e: arr2){
            if (e == arr2[arr2.length-1]) {
                System.out.print(e);
            } else {
                System.out.print(e + ",");
            }
        }
        System.out.println();
    }
}
