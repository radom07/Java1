package LombokDemo.Aggregation;

public class Test {
    public static void main(String[] args) {

        System.out.println("=== 1. TEST @Data ===");
        var user = new UserProfile(101L); // Konstruktor wymaga pola final (id)
        user.setUsername("john_doe");
        user.setEmail("john@example.com");

        System.out.println("User profile: " + user);
        // Sprawdzamy działanie settera i gettera
        user.setUsername("john_shadow");
        System.out.println("Updated username: " + user.getUsername());


        System.out.println("\n=== 2. TEST @Value ===");
        var token = new TokenResponse("secret_abc123", 3600);
        System.out.println("Token response: " + token);
        System.out.println("Access token via getter: " + token.getAccessToken());

        // OBIEKT JEST NIEMUTOWALNY:
        // token.setAccessToken("new"); // BŁĄD KOMPILACJI! @Value nie ma setterów.


        System.out.println("=== 3. CUSTOM BUILDER METHODS TEST ===");

        var baseConfig = AppConfig.createConfig()
                .environment("DEVELOPMENT")
                .timeoutMillis(2500)
                .permission("READ")
                .generate();

        System.out.println("Base Config: " + baseConfig);


        System.out.println("\n=== 4. TO_BUILDER (CLONING) TEST ===");

        // Chcemy stworzyć konfigurację na produkcję.
        // Zamiast przepisywać timeout i uprawnienia, używamy .toBuilder()
        var prodConfig = baseConfig.toBuilder()
                .environment("PRODUCTION") // Nadpisujemy tylko środowisko
                .generate();               // Zamykamy naszym spersonalizowanym generate()

        System.out.println("Prod Config: " + prodConfig);

        // Sprawdźmy, czy lista uprawnień "READ" skopiowała się automatycznie
        System.out.println("Prod Permissions: " + prodConfig.getPermissions());

        System.out.println("=== SUPERBUILDER WITH INHERITANCE TEST ===");

        // .brand() -> pole z klasy Vehicle
        // .numberOfDoors() i .engineType() -> pola z klasy Car
        Car myCar = Car.builder()
                .brand("Tesla")
                .numberOfDoors(5)
                .engineType("ELECTRIC")
                .build();

        System.out.println("My Car details: " + myCar);

        // Sprawdzamy działanie getterów (zarówno dziedziczonego, jak i własnego)
        System.out.println("Car brand (from parent): " + myCar.getBrand());
        System.out.println("Car doors (from child): " + myCar.getNumberOfDoors());
    }
}
