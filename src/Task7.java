import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        BigDecimal[] prices = {new BigDecimal("10.50"), new BigDecimal("2.28"), new BigDecimal("3.71"), new BigDecimal("4.50")};
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Price " + (i + 1) + ": " + prices[i]);
        }
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (BigDecimal price : prices) {
            totalPrice = totalPrice.add(price);
        }
        System.out.println("Total price: " + totalPrice.setScale(2, RoundingMode.HALF_UP));
    }
}
