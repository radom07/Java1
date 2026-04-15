import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter price: ");
        String price = Input.sc.nextLine();
        BigDecimal decimalPrice = new BigDecimal(price);

        System.out.print("Enter discount in percent: ");
        String discount = Input.sc.nextLine();
        BigDecimal decimalDiscount = new BigDecimal(discount);

        BigDecimal discountedPrice = decimalPrice.subtract(decimalPrice.multiply(decimalDiscount.divide(new BigDecimal("100"))), new MathContext(4, RoundingMode.HALF_UP));
        System.out.println("Discounted price: " + discountedPrice);
    }
}
