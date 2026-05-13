package Task1;

public final class PasswordValidator {
    private PasswordValidator() {
    }

    public static void validate(String pwd) {
        if (pwd == null || pwd.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }
        if (!pwd.matches(".*[0-9].*")) {
            throw new IllegalArgumentException("Password must contain at least one digit");
        }
        System.out.println("Password is valid");
    }
}
