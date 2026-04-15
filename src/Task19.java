import java.math.BigDecimal;

public class Task19 {
    public static void main(String[] args) {
        Product bike = new Product("Bike", new BigDecimal("999.99"));
        Product car = new Product("Car", new BigDecimal("1999.99"));

        bike.showProduct();
        car.showProduct();

        bike.reducePrice(100.00);
        car.reducePrice(1000.00, "Discount");

        System.out.println();
        System.out.println("Show after reduce:");
        bike.showProduct();
        car.showProduct();
    }
}
