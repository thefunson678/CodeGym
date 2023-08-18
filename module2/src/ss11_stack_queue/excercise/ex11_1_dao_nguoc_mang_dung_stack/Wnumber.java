package ss11_stack_queue.excercise.ex11_1_dao_nguoc_mang_dung_stack;

import java.util.Scanner;
import java.util.Stack;

public class Wnumber{

    public static void main(String[] args) {
        Stack<Integer> stackBefore = new Stack<Integer>();
        Stack<Integer> stackAfter = new Stack<Integer>();
        int currentElement = 0;
        int lastElelment;
        int menuNumber = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add element");
        System.out.println("2. Invert elelment and Exit");
        System.out.println("3. Exit");
        do {
            System.out.print("Choose menu: ");
            menuNumber = Integer.parseInt(scanner.nextLine());
            switch (menuNumber){
                case 1:
                    System.out.print("Enter the element number " + (stackBefore.size() + 1) + ": ");
                    currentElement = Integer.parseInt(scanner.nextLine());
                    stackBefore.push(currentElement);
                    break;
                case 2:
                    System.out.print("Array before: ");
                    for (Integer integer: stackBefore) {
                        System.out.print(" " + integer);
                    }
                    System.out.println();
                    revertArray(stackBefore,stackAfter);
                    System.out.print("Array after: ");
                    for (Integer integer: stackAfter) {
                        System.out.print(" " + integer);
                    }
                    System.out.println();
                    System.out.println("Done!");
                    System.exit(0);
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Out of Menu choose!");
            }

        } while (menuNumber != 3);

    }
    public static void revertArray(Stack stackBefore,Stack stackAfter){
        if (stackBefore.isEmpty()){
            System.out.println("Array Empty!");
        } else {
            while (!stackBefore.isEmpty()){
                stackAfter.push(stackBefore.pop());
            }
        }
    }
}
