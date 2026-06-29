package Task1;

public class Main {
    public static void main(String[] args) {
        var validUser = new User("Polka1234!");
        var tooShortUser = new User("P1!");
        var noSpecialUser = new User("HasloZCyfra1");

        System.out.println("""
            === VALIDATION RESULTS ===
            Correct password:    %b
            Password too short:  %b
            Missing the special character:   %b
            """.formatted(
                PasswordValidator.validate(validUser),
                PasswordValidator.validate(tooShortUser),
                PasswordValidator.validate(noSpecialUser)
        ));
    }
}