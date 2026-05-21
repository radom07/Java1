import java.util.Optional;

public class Task6 {

    public static void main(String[] args) {

        String[] nicknames = {"Janek", null, "Ania", null, "Kuba"};

        // Wersja A
        for (String nick : nicknames) {
            Optional.ofNullable(nick)
                    .ifPresent(n -> System.out.println("Found: " + n));
        }

        // Wersja B
        for (String nick : nicknames) {
            Optional.ofNullable(nick).ifPresentOrElse(n -> System.out.println("Found: " + n), () -> System.out.println("No nickname"));
        }
    }
}
