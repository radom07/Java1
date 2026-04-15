import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task1 {
    public static void main(String[] args) {
        BigDecimal value1 = new BigDecimal("10.50");
        System.out.println("BigDecimal object: " + value1);

        BigDecimal value2 = new BigDecimal("2.25");

        System.out.println("Sum of two BigDecimal objects: " + value1.add(value2));
        System.out.println("Difference of two BigDecimal objects: " + value1.subtract(value2));
        System.out.println("Product of two BigDecimal objects: " + value1.multiply(value2));
        System.out.println("Quotient of two BigDecimal objects: " + value1.divide(value2, RoundingMode.HALF_UP));
    }
}
