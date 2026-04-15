public class Person {
    public static int NUMBER_OF_PEOPLE = 0;

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        NUMBER_OF_PEOPLE++;
    }

    public Person(String name) {
        this(name, 0);
    }

    public void introduceYourself() {
        System.out.println( "I am " + name + " and I am " + age + " years old.");
    }

    public void introduceYourself(String greeting) {
        System.out.println(greeting);
        System.out.println( "I am " + name + " and I am " + age + " years old.");
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public int compareAge(Person other) {
        return Math.abs(age - other.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
