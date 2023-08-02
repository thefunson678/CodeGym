package ss07_Abstract_class_Interface.excercise.ex7_2_Colorable;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Geometry[] geometries = new Geometry[5];
        geometries[0] = new Rectange();
        geometries[1] = new Square();
        geometries[2] = new Rectange();
        geometries[3] = new Square();
        geometries[4] = new Square();
        for (Geometry geo:geometries){
            if (geo instanceof Square){
                ((Square) geo).howToColor();
            }
        }
    }

}
