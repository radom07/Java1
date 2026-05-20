import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Task8 {

    static void printWithNumbers(List<String> lines, Consumer<String> consumer) {
        for (int i = 0; i < lines.size(); i++) {
            String numbered = (i + 1) + ". " + lines.get(i);
            consumer.accept(numbered);
        }
    }

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("alpha", "beta", "gamma", "delta");
        // powinna być lambda Consumer<String> logger, ale spróbowałem też takiego podejścia
        printWithNumbers(lines, System.out::println);
    }
}
