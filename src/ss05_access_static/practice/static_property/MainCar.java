package ss05_access_static.practice.static_property;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 6");
        System.out.println(Car.getNumberOfCars());
        Car car2 = new Car("Mazda 6","Skyactiv 3");
        System.out.println(Car.getNumberOfCars());

    }
}
