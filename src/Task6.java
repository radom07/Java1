public class Task6 {
    public static void main(String[] args) {
        Month[] months = Month.values();
        for (Month month : months) {
            System.out.println(month + " has " + month.getDays() + " days");
        }
    }
}
