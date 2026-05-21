import java.util.Optional;

public class Task3 {

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

    static String getCityOrDefault(String code){
        return findCityByCode(code).orElse("Unknown city");
    }

    public static void main(String[] args) {
        System.out.println("WA: found? " + getCityOrDefault("WA"));
        System.out.println("XX: found? " + getCityOrDefault("XX"));
        System.out.println("null: found? " + getCityOrDefault("null"));
    }
}
/*
uwaga na null — co się stanie?
Nie ma null, bo tworzy się optional empty a or else ustawia nieznane miasto
 */
