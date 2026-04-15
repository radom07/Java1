import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Enter nett price: ");
        String nettPrice = Input.sc.nextLine();
        BigDecimal netPriceDecimal = new BigDecimal(nettPrice);

        BigDecimal priceWithTax = netPriceDecimal.add(netPriceDecimal.multiply(new BigDecimal("0.23")), new MathContext(4, RoundingMode.HALF_UP));
        System.out.println("Price with tax: " + priceWithTax);
    }
}