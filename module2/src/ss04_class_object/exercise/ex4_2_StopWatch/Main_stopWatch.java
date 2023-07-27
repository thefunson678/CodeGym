package ss04_class_object.exercise.ex4_2_StopWatch;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.lang.System;
import java.util.logging.SimpleFormatter;

public class Main_stopWatch {
    public static void main(String[] args) {
        int choice=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Start");
        System.out.println("2. Exit");
        StopWatch stopwatch = new StopWatch();
        do {
            System.out.print("Enter number 1 to start, 2 to exit: ");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                break;
            } else if (choice == 2) {
                System.exit(0);
            }
        } while (choice != 1);
        System.out.print("Enter choice number between 1-100,000 to count: ");
        choice = Integer.parseInt(scanner.nextLine());
        int a = 0;
        if (choice > 0 && choice <=100000) {
            stopwatch.start();
            for (int i = 0; i <= choice; i++) {
                System.out.print(i);
                System.out.println();
                a = a/2 + a*2 + a/10;
                a++;
                a++;
            }
            stopwatch.stop();
            System.out.println();
            Timestamp time1 = new Timestamp(stopwatch.getStartTime());
            Timestamp time2 = new Timestamp(stopwatch.getEndTime());
            System.out.println("Start Time: " + time1);
            System.out.println("End Time: " + time2);
            System.out.print("Total time:");
            System.out.println(stopwatch.elapseTime());
        }
    }
}
