package ss06_inheritance_polymorphism.excercise.ex06_3_Point_MoveablePoint;

public class Test {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1,1,5,10);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
