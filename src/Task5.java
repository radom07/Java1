public class Task5 {
    public static void main(String[] args) {
        Car car = new Car("BMW", 2015);
        System.out.println("Before change > " + car);
        car.changeBrand("Mercedes");
        System.out.println("After change > " + car);
    }
}
