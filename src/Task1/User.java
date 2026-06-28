package Task1;

public class User {
    @PasswordValidation(minLength = 10, requireSpecialChar = true)
    private String password;

    public User(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
