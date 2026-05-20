import java.util.function.Predicate;

public class Task6 {

    public static void main(String[] args) {
        Predicate<String> minLen3 = s -> s != null && s.length() >= 3;
        Predicate<String> onlyLettersAndDigits = s -> s.matches("[a-zA-Z0-9]+");
        Predicate<String> startsWithLetter = s -> !s.isEmpty() && Character.isLetter(s.charAt(0));
        Predicate<String> isValidLogin = minLen3.and(onlyLettersAndDigits).and(startsWithLetter);

        String[] logins = {"adam", "Ala123", "x", "User_01", "ADMIN", "gość"};

        int validLogins = 0;
        System.out.println("Valid logins:");
        for (String login : logins) {
            if (isValidLogin.test(login)) {
                validLogins++;
                System.out.println(login);
            }
        }
        System.out.println("Number of valid logins: " + validLogins);
    }
}
