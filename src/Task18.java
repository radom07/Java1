import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class Task18 {
    public static void main(String[] args) {
        System.out.print("Enter quantity of prices: ");
        int quantity = Input.sc.nextInt();
        BigDecimal[] prices = new BigDecimal[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.print("Enter price " + (i + 1) + ": ");
            prices[i] = new BigDecimal(Input.sc.next());
        }

        Locale poland = new Locale("pl", "PL");
        NumberFormat pln = NumberFormat.getCurrencyInstance(poland);

        for (BigDecimal price : prices) {
            System.out.println(pln.format(price));
        }
    }
}
