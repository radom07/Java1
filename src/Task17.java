import java.math.BigDecimal;

public class Task17 {
    public static void main(String[] args) {
        // Czy może chodziło o wczytanie jednego Stringa i jego podział na Name i Price?
        System.out.print("Enter product name: ");
        String productName = Input.sc.nextLine();

        System.out.println("Enter product price: ");
        BigDecimal productPrice = new BigDecimal(Input.sc.nextLine());

        System.out.println("Product: " + productName.toUpperCase() + ", Price: " + productPrice + " PLN");
    }
}
