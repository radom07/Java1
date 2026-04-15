import java.math.BigDecimal;

public class Product {

    private String name;
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public void showProduct() {
        System.out.println("Product: " + name + ", Price: " + price + "zł");
    }

    public void reducePrice(Double amount) {
        this.price = this.price.subtract(BigDecimal.valueOf(amount));
    }

    public void reducePrice(Double amount, String reason) {
        System.out.println("Reason reduce: " + reason);
        this.price = this.price.subtract(BigDecimal.valueOf(amount));
    }
}
