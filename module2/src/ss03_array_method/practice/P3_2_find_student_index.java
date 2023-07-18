package ss03_array_method.practice;
import java.util.Scanner;
public class P3_2_find_student_index {
    public static void main(String[] args) {
        String[] students = {"Thuận", "Quân", "Phong", "Trí", "Công", "Hoài", "Tâm Tình"};
        String findname;
        String checkindex = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of student: ");
        findname  = input.nextLine();
        for (int i = 0; i < students.length;i++){
            if (findname.equals(students[i])){
                checkindex = "Position of the students in the list " + findname + " is: " + (i + 1);
                break;
            } else {
                checkindex = "Không tìm thấy";
            }
        }
        System.out.println(checkindex);
    }
}
