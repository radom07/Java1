package LombokDemo.GeneratingMethods;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
//@ToString(callSuper = true) dołączy do toString dane z klasy nadrzędnej
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Product2 {

    @EqualsAndHashCode.Include
    private final UUID id = UUID.randomUUID(); // Pole final - Lombok wygeneruje dla niego tylko getter

    @ToString.Include
    private String name;
    @ToString.Include
    private BigDecimal price;

    private int stockQuantity;


    public Product2(String name, BigDecimal price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
}
