public class Task11 {
    public static void main(String[] args) {
        Month[] firstQuarter = {Month.JANUARY, Month.FEBRUARY, Month.MAY};

        int sumDays = 0;
        for (Month month : firstQuarter) {
            sumDays += month.getDays();
            System.out.println(month);
        }
        System.out.println("Sum of days in first quarter: " + sumDays);
    }
}
