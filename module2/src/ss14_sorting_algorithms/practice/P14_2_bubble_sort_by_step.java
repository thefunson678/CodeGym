package ss14_sorting_algorithms.practice;

import java.util.Scanner;

public class P14_2_bubble_sort_by_step {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size =Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println();
        bubbleSortByStep(list);
        System.out.println();
        System.out.print("Your output list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
    public static void bubbleSortByStep(int[] list){
        boolean isSorted = false;
        int nextStep = 0;
        int stepCount=0;
        int tmp;
        System.out.println("Bubble Sort Step view: ");
        while (!isSorted && list.length >0){
            isSorted =true;
            for (int i= 0;i<list.length-1;i++){
                if (list[i]>=list[i+1]){
                    tmp = list[i+1];
                    list[i+1]=list[i];
                    list[i]=tmp;
                    isSorted = false;
                }
            }
            stepCount++;
            System.out.print("Loop " + stepCount + ": ");
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + "\t");
            }
            System.out.println();
            nextStep++;
        }
        return;
    }
}
