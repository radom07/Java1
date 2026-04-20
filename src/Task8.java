public class Task8 {
    public static void main(String[] args) {
        Month[] months = Month.values();
        for (Month month : months) {
            System.out.println(month.ordinal() + " - " + month.name());
        }

        Month month1 = Month.JANUARY;
        Month month2 = Month.MARCH;
        Month month3 = Month.DECEMBER;

        System.out.println("January vs March: " + month1.compareTo(month2));
        System.out.println("December vs March: " + month3.compareTo(month2));
        System.out.println("March vs March: " + month2.compareTo(month2));

        Month currentMonth = Month.MARCH;
        Month paymentMonth = Month.FEBRUARY;
        if (currentMonth.compareTo(paymentMonth) > 0)
            System.out.println("After the payment deadline");
        else
            System.out.println("Still on due date");
    }
}
