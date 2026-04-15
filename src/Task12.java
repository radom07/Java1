public class Task12 {
    public static void main(String[] args) {
        Person john = new Person("John", 25);

        john.introduceYourself();
        System.out.println();
        john.introduceYourself("Welcome!");
    }
}
