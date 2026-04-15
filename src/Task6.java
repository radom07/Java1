import java.math.BigDecimal;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("Enter first price: ");
        BigDecimal firstPrice = new BigDecimal(Input.sc.nextLine());
        System.out.print("Enter second price: ");
        BigDecimal secondPrice = new BigDecimal(Input.sc.nextLine());

        int comparisonResult = firstPrice.compareTo(secondPrice);
        if (comparisonResult == 0) {
            System.out.println("Prices are equal");
        }
        else if (comparisonResult < 0) {
            System.out.println("Second price is greater");
        }
        else {
            System.out.println("First price is greater");
        }
    }
}
