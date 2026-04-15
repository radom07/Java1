import java.sql.SQLOutput;

public class Task15 {
    public static void main(String[] args) {
        Person john = new Person("John", 25);
        Person jane = new Person("Jane", 22);
        Person bob = new Person("Bob", 23);

        System.out.println("Via Class:");
        System.out.println("How many objects were created? " + Person.NUMBER_OF_PEOPLE);
        System.out.println();
        System.out.println("Via Object:");
        System.out.println("How many objects were created? " + bob.NUMBER_OF_PEOPLE);
        System.out.println();

        if(Person.NUMBER_OF_PEOPLE == bob.NUMBER_OF_PEOPLE)
            System.out.println("The same number of objects were created in different access");
        else System.out.println("Different number of objects were created in different access");
    }
}
