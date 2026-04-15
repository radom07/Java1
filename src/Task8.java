import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task8 {
    public static void main(String[] args) {
        System.out.print("Enter number of products: ");
        BigDecimal[] cart = new BigDecimal[Input.sc.nextInt()];
        for (int i = 0; i < cart.length; i++) {
            System.out.print("Enter price of product " + (i + 1) + ": ");
            cart[i] = new BigDecimal(Input.sc.next());
        }
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (BigDecimal price : cart) {
            totalPrice = totalPrice.add(price);
        }
        BigDecimal averagePrice = totalPrice.divide(new BigDecimal(cart.length), 2, RoundingMode.HALF_UP);
        System.out.println("Average price: " + averagePrice);
    }
}
