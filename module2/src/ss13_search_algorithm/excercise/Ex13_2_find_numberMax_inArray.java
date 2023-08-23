package ss13_search_algorithm.excercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex13_2_find_numberMax_inArray {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean isExit;
        String newInput;
        ArrayList arrayNumber = new ArrayList<>();
        do {
            System.out.print("Enter number (Enter exit to exit): ");
            newInput = scanner.nextLine();
            isExit =  (newInput.equals("exit"));
            if (!isExit){
                arrayNumber.add(Double.parseDouble(newInput));
            }
        } while (!isExit);
        System.out.println(arrayNumber);
    }
}
