import java.math.BigDecimal;

public class Task18 {
    public static void main(String[] args) {
        Product bike = new Product("Bike", new BigDecimal("999.99"));
        Product car = new Product("Car", new BigDecimal("1999.99"));

        bike.showProduct();
        car.showProduct();
    }
}
