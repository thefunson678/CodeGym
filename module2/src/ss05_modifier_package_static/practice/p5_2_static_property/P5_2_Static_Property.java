package ss05_modifier_package_static.practice.p5_2_static_property;

public class P5_2_Static_Property {
    public static void main(String[] args) {
        Car Car1 = new Car("Madaz 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }


}
