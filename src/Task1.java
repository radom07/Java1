public class Task1 {
    public static void main(String[] args) {
        welcome("Jan");
        welcome("Krzysztof");
        welcome("piotr");
    }

    private static void welcome(String name) {
        System.out.println("Welcome, " + name.toUpperCase() + "!");
    }
}