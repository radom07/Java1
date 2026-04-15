public class Task10 {
    public static void main(String[] args) {
        Car[] cars = {new Car("BMW", 2015), new Car("Audi", 2010), new Car("Mercedes", 1998)};
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
