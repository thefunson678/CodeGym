package ss05_modifier_package_static.excercise.ex5_1_access_modifor;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

import static java.lang.reflect.Modifier.isProtected;

public class TestCircle {

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println( "Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
//
//
//        Field radiusField = Circle.class.getField("radius");
//        int modifers = radiusField.getModifiers();
//        boolean titleIsProtected = isProtected(modifers);
//
//        Method myMethod = Circle.class.getDeclaredMethod("getRadius");
//        System.out.println(Modifier.toString(myMethod.getModifiers()));



    }
}
