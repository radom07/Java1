package LombokDemo.Aggregation;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@Builder(
        builderMethodName = "createConfig", // 1. Zmiana nazwy metody startowej
        buildMethodName = "generate",        // 2. Zmiana nazwy metody kończącej
        toBuilder = true                     // 3. Włączenie możliwości klonowania obiektów
)
public class AppConfig {
    private String environment;
    private int timeoutMillis;

    @Singular
    private List<String> permissions;
}