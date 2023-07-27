package ss05_modifier_package_static.practice.p5_1_student;

class Student {
    private int rollno;
    private String name;
    private static String college;

    static {
        college = "BBDIT";
    }
    static void change() {
        college = "CODEGYM";
    }

    public Student() {

    }

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollno + " " +  name + " " + college ;
    }
}
