import java.math.BigDecimal;

public class Task20 {
    public static void main(String[] args) {
        Product[] products = {new Product("Bike", new BigDecimal("999.99")),
                new Product("Car", new BigDecimal("1999.99")),
                new Product("Scooter", new BigDecimal("50.00"))
        };

        Shop transportShop = new Shop("Transport Shop", products);

        transportShop.showProducts();
    }
}
