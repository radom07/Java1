import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task20 {
    public static void main(String[] args) {
        System.out.print("Enter a price: ");
        BigDecimal inputPrice = new BigDecimal(Input.sc.next());

        BigDecimal roundedPrice = inputPrice.setScale(2, RoundingMode.CEILING);

        System.out.println("Price rounded up to full grosz: " + roundedPrice + " PLN");
    }
}
