import java.math.BigDecimal;

public class Task19 {
    public static void main(String[] args) {
        System.out.print("Enter total bill amount: ");
        BigDecimal totalBill = new BigDecimal(Input.sc.next());

        System.out.print("Number of people: ");
        int numberOfPeople = Input.sc.nextInt();

        BigDecimal perPerson = totalBill.divide(new BigDecimal(numberOfPeople), 2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Each person should pay: " + perPerson);
    }
}
