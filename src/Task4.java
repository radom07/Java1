import java.util.Optional;

public class Task4 {

    static String generateDefault() {
        System.out.println("  >> Generuję wartość domyślną...");
        return "DOMYŚLNA";
    }

    public static void main(String[] args) {
        Optional<String> opt1 = Optional.of("TEST");
        Optional<String> opt2 = Optional.empty();

        System.out.println("opt1 (orElse): " + opt1.orElse(generateDefault()));
        System.out.println("opt2 (orElse): " + opt2.orElse(generateDefault()));
        System.out.println();
        System.out.println("opt1 (orElseGet): " + opt1.orElseGet(Task4::generateDefault));
        System.out.println("opt2 (orElseGet): " + opt2.orElseGet(Task4::generateDefault));
    }
}
/*
Dlaczego tak się dzieje?
W przypadku orElse(generateDefault()) przekazujesz do metody wartość.
Żeby Java mogła wywołać metodę orElse(), musi najpierw dowiedzieć się, co ma do niej włożyć jako argument – dlatego zawsze najpierw wykonuje generateDefault().
W przypadku orElseGet(() -> generateDefault()) przekazujesz funkcję (interfejs Supplier), czyli przepis na to, jak stworzyć wartość w przyszłości.
Java wywoła tę funkcję (wykona lambdę) dopiero wtedy, gdy sprawdzi, że Optional jest pusty i ta wartość jest jej naprawdę potrzebna. To tak zwane leniwe przetwarzanie (lazy evaluation)

 WNIOSEK:
 1. orElse() używaj TYLKO wtedy, gdy wartość domyślna jest już gotowa "w pamięci"
    (np. stała tekstowa, gotowy obiekt-konstant, 0, false).
 2. orElseGet() używaj ZAWSZE, gdy wyznaczenie wartości domyślnej wymaga jakichkolwiek
    obliczeń, zapytania do bazy danych, tworzenia nowego obiektu (new MyObject())
    lub innej kosztownej operacji.
 */
