import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {
        Function<String, String> spacesRemover = s -> s.replaceAll(" ", "");
        Function<String, String> lowerCase = String::toLowerCase;
        Function<String, String> normalizeLogin = spacesRemover.andThen(lowerCase);

        String[] logins = {"  Adam  ", "ANIA K  ", "  k o w a l "};

        String[] normalizedLogins = new String[logins.length];
        for (int i = 0; i < logins.length; i++) {
            normalizedLogins[i] = normalizeLogin.apply(logins[i]);
        }

        for (String normalizedLogin : normalizedLogins) {
            System.out.println(normalizedLogin);
        }
    }
}
