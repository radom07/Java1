public class Task9 {
    public static void main(String[] args) {
        Month[] months = Month.values();
        for (Month month : months) {
            System.out.println(month.name() + " is holiday season? " + month.isHolidaySeason());
        }
    }
}
