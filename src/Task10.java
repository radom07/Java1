public class Task10 {
    public static void main(String[] args) {
        Person john = new Person("John", DayOfWeek.SUNDAY);
        Person jane = new Person("Jane", DayOfWeek.SATURDAY);
        Person jack = new Person("Jack", DayOfWeek.MONDAY);

        john.showDayOff();
        jane.showDayOff();
        jack.showDayOff();
    }
}
