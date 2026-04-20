public class Task20 {
    public static void main(String[] args) {
        DayOfWeek day1 = DayOfWeek.SUNDAY;
        DayOfWeek day2 = DayOfWeek.SUNDAY;

        System.out.println("Operator '==': " + (day1 == day2));
        System.out.println("Method 'equals()': " + day1.equals(day2));
    }
}
