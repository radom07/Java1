package LombokDemo.GeneratingMethods;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@ToString(exclude = "id")
@EqualsAndHashCode(of = "id")
public class Product {
    private final UUID id = UUID.randomUUID(); // Pole final - Lombok wygeneruje dla niego tylko getter
    private String name;
    private BigDecimal price;
    private int stockQuantity;


    public Product(String name, BigDecimal price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
}
