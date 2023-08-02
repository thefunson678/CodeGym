package ss07_Abstract_class_Interface.practice.p7_3_CircleComparator;
import ss05_modifier_package_static.excercise.ex5_1_access_modifor.Circle;

import java.util.Comparator;
public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()) return 1;
        else if (o1.getRadius() < o2.getRadius()) return -1;
        else return 0;
    }
}
