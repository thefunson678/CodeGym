package ss15_exception_debug.excercise;

public class Test {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(2,2,4);
        }
        catch (IllegalTriangleException e){
            System.err.println(e.getMessage());
        }
    }
}
