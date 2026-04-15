import java.math.BigDecimal;

public class Task2 {
    public static void main(String[] args) {
        BigDecimal bigDecimalFromString = new BigDecimal("3.14");
        BigDecimal bigDecimalFromDouble = new BigDecimal(3.14);

        System.out.println("BigDecimal from String: " + bigDecimalFromString);
        System.out.println("BigDecimal from double: " + bigDecimalFromDouble);
    }
}
