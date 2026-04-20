public class Task2 {
    public static void main(String[] args) {
        DayOfWeek[] values = DayOfWeek.values();
        for (DayOfWeek day : values) {
            System.out.println(day + " is a weekend day: " + day.isWeekend());
        }
    }
}
