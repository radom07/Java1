package Task2;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        String vehicleDescription = vehicle.description();
        System.out.println(vehicleDescription);
        vehicle.oldMethod();

        String carDescription = car.description();
        System.out.println(carDescription);
        car.oldMethod();
        car.newMethod();

        Calculation add = (a, b) -> a + b;
        System.out.println(add.execute(1, 2));
    }
}
