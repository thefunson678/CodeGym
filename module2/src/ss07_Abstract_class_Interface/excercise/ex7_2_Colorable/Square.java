package ss07_Abstract_class_Interface.excercise.ex7_2_Colorable;

public class Square extends Geometry implements IColorable{
    @Override
    public void howToColor() {
        System.out.println("Color all four sides!");
    }
}
