public class Task4 {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;

        switch (dayOfWeek) {
            case MONDAY, TUESDAY:
                System.out.println("Beginning of the week");
                break;
            case WEDNESDAY, THURSDAY:
                System.out.println("Midweek");
                break;
            case FRIDAY, SATURDAY, SUNDAY:
                System.out.println("Weekend");
        }
    }
}
