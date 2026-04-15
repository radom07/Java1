import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task9 {
    public static void main(String[] args) {
        System.out.print("Enter price in PLN: ");
        BigDecimal price = new BigDecimal(Input.sc.next());

        System.out.print("Enter exchange rate to EUR: ");
        BigDecimal exchangeRate = new BigDecimal(Input.sc.next());

        BigDecimal euroPrice = price.divide(exchangeRate, 2, RoundingMode.HALF_UP);
        System.out.println("Price in EUR: " + euroPrice);
    }
}
