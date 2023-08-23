package ss14_sorting_algorithms.practice;

import java.util.Scanner;

public class P14_3_sap_xep_chon_selection_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " number:");
        for (int i =0; i<list.length;i++){
            System.out.print("Number " + (i+1) +": ");
            list[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Your input list is:");
        for (int i=0;i<list.length;i++){
            System.out.print(list[i] + "\t");
        }
        bubbleSortByStep(list);
        System.out.println();
        System.out.println("Your out list is:");
        for (int i=0;i<list.length;i++){
            System.out.print(list[i] + "\t");
        }
    }
    public static void bubbleSortByStep(int[] list){
        int nextStep = 0;
        int minValue=0;
        int minIndex=0;
        int tmp=0;
        if (list.length ==0){
            return;
        } else {
            while (nextStep < list.length) {
                minIndex = -1;
                minValue = list[nextStep];
                for (int i = nextStep; i<list.length;i++){
                    if (minValue >= list[i]){
                        minValue = list[i];
                        minIndex = i;
                    }
                }
                //swap
                if (minIndex != nextStep & minIndex != -1){
                    tmp = list[nextStep];
                    list[nextStep] =minValue;
                    list[minIndex] = tmp;
                }
                nextStep++;
            }
            return;
        }
    }
}
