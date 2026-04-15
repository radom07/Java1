public class Task16 {
    public static void main(String[] args) {
        Person[] people = {new Person("John", 15), new Person("Jane", 22), new Person("Bob", 23)};

        System.out.println("Adults:");
        for (Person person : people) {
            if (person.isAdult())
                person.introduceYourself();
        }
    }
}
