package LombokDemo.Aggregation;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString
@SuperBuilder // @SuperBuilder musi być na klasie nadrzędnej
public abstract class Vehicle {
    private final String brand;
}
