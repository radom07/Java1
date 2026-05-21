import java.util.Map;
import java.util.Optional;

public class Task5 {

    static String getRequired(String key) {
        Map<String, String> config = Map.of(
                "db.url", "jdbc:mysql://localhost:3306/app",
                "db.user", "admin"
        );

        return Optional.ofNullable(config.get(key)).orElseThrow(() -> new IllegalArgumentException("Missing key: " + key));
    }

    public static void main(String[] args) {
        System.out.println("getRequired(\"db.url\"): " + getRequired("db.url"));
        try {
            System.out.println("getRequired(\"db.password\"): " + getRequired("db.password"));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

}
