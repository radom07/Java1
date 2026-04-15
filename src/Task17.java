public class Task17 {
    public static void main(String[] args) {
        Person john = new Person("John", 15);
        Person jane = new Person("Jane", 22);

        john.introduceYourself();
        jane.introduceYourself();

        int ageComparisonResult = john.compareAge(jane);
        System.out.println("Compare age: " + ageComparisonResult);
    }
}
