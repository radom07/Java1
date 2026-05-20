import java.util.Random;
import java.util.function.Supplier;

public class Task10 {

    public static void main(String[] args) {
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        final Random rng = new Random();

        Supplier<String> codeSupplier = () -> {
            StringBuilder sb = new StringBuilder(6);
            for (int i = 0; i < 6; i++) {
                sb.append(alphabet.charAt(rng.nextInt(alphabet.length())));
            }
            return sb.toString();
        };

        String[] codes = new String[10];
        for (int i = 0; i < codes.length; i++) {
            codes[i] = codeSupplier.get();
        }

        System.out.println("Generated codes:");
        for (String code : codes) {
            System.out.println(code);
        }
    }
}
