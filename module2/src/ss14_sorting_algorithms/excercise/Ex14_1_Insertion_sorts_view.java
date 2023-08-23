package ss14_sorting_algorithms.excercise;
import java.util.Scanner;

class Ex14_1_Insertion_sorts_view {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
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
        selectionSortByStep(list);
        System.out.println();
        System.out.print("Your output list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
    public static void selectionSortByStep(int[] list){
        int selectedValue = list[0];
        int currentPosition;
        for (int i = 1; i<list.length;i++){
            selectedValue = list[i];
            currentPosition = i;
            while (currentPosition > 0 && selectedValue < list[currentPosition-1]){
                list[currentPosition] = list[currentPosition-1];
                currentPosition--;
            }
            list[currentPosition]=selectedValue;
            display(list,i);
        }
    }
    public static void display(int[] list,int stepNo){
        System.out.print("Loop "+ stepNo + ":\t");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println();
    }

}
