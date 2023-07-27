package ss05_modifier_package_static.practice.p5_1_student;

public class P5_1_student_static_method {
    public static void main(String[] args) {
        Student.change(); //calling change method
        //creating objects
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        //calling display method
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}
