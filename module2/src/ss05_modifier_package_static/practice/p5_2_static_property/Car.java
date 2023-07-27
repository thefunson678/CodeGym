package ss05_modifier_package_static.practice.p5_2_static_property;

class Car {
    private String name;
    private String engine;
    public static  int numberOfCars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberOfCar() {
        return numberOfCars;
    }

    public static void setNumberOfCar(int numberOfCar) {
        Car.numberOfCars = numberOfCar;
    }

    public Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }
}
