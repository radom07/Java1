import java.math.BigDecimal;

public class Task10 {
    public static void main(String[] args) {
        double resultDouble = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 = " + resultDouble + " <- using double");

        BigDecimal resultBigDecimal = new BigDecimal("0.1").add(new BigDecimal("0.2"));
        System.out.println("0.1 + 0.2 = " + resultBigDecimal + " <- using BigDecimal");

        int comparisonResult = resultBigDecimal.compareTo(BigDecimal.valueOf(resultDouble));
        if (comparisonResult == 0) {
            System.out.println("The results are equal");
        }
        else {
            System.out.println("The results are not equal");
        }
    }
}
