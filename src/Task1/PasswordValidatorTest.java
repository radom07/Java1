package Task1;

public class PasswordValidatorTest {
    public static void main(String[] args) {
        PasswordValidator.validate("12345678");
        try {
            PasswordValidator.validate("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            PasswordValidator.validate("Password");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
