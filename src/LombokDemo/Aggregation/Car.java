package LombokDemo.Aggregation;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString(callSuper = true)
@SuperBuilder
public class Car extends Vehicle {
    private final int numberOfDoors;
    private final String engineType;
}