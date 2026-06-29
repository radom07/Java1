package LombokDemo.Constructors;

public class Test {
    public static void main(String[] args) {
        System.out.println("1. ALL-ARGS CONSTRUCTOR TEST");
        var customerFull = new Customer(1L, "john.doe@example.com", "John Doe", true);
        System.out.println("Full Customer: " + customerFull);


        System.out.println("\n2. REQUIRED-ARGS CONSTRUCTOR TEST");
        // Przekazujemy TYLKO id (bo jest final) oraz email (bo ma @NonNull).
        var customerRequired = new Customer(2L, "alex.smith@example.com");
        System.out.println("Required Customer: " + customerRequired);

        // Można później uzupełnić za pomocą setterów
        customerRequired.setFullName("Alex Smith");
        System.out.println("Required Customer updated: " + customerRequired);


        System.out.println("\n3. NO-ARGS CONSTRUCTOR TEST");
        // Konstruktor bezargumentowy po prostu tworzy "pusty" obiekt.
        // Obejście @NonNull: W konstruktorze bezargumentowym, pole email dostanie wartość null, mimo że ma adnotację @NonNull!
        // Lombok w tym jednym, konkretnym przypadku pomija walidację anty-null, co może doprowadzić do ukrytych błędów (NullPointerException)
        var customerEmpty = new Customer();
        System.out.println("Empty Customer: " + customerEmpty);
    }
}
