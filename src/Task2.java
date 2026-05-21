import java.util.Optional;

public class Task2 {

    static Optional<String> findCityByCode(String code) {
        switch (code) {
            case "WA":
                return Optional.of("Warsaw");
            case "KR":
                return Optional.of("Krakow");
            case "GD":
                return Optional.of("Gdansk");
            default:
                return Optional.empty();
        }
    }

    public static void main(String[] args) {
        System.out.println("WA: found? " + findCityByCode("WA").orElse("not found"));
        System.out.println("PO: found? " + findCityByCode("PO").orElse("not found"));
        System.out.println("GD: found? " + findCityByCode("GD").orElse("not found"));
    }
}
/*
get() bez sprawdzania rzuci NoSuchElementException
public T get() {
        if (value == null) {
            throw new NoSuchElementException("No value present");
        }
        return value;
    }
 */
