import java.util.Optional;

public class Task7 {

    static Optional<String> extractLogin(Optional<String> email) {
        return email.map(e -> e.split("@")[0])
                .map(String::toUpperCase);
    }

    public static void main(String[] args) {

        Optional<String> login1 = extractLogin(Optional.of("jan.kowalski@example.com"));
        Optional<String> login2 = extractLogin(Optional.empty());

        System.out.println("login1: " + login1);
        System.out.println("login2: " + login2);
    }
}
