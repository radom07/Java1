package LombokDemo.GeneratingMethods;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        System.out.println("TEST PRODUCT (Exclude)\n");

        var p1 = new Product("Laptop", new BigDecimal("4500.00"), 10);
        var p2 = new Product("Laptop", new BigDecimal("4500.00"), 10);

        // 1. Test działania @Getter
        System.out.println("Initial name: " + p1.getName());
        System.out.println("Initial price: " + p1.getPrice());
        System.out.println("Initial stock: " + p1.getStockQuantity());
        System.out.println("Generated UUID: " + p1.getId()); // Getter działa też dla pola final!

        // 2. Test działania @Setter
//        p1.setUUID - brak bo pole final
        p1.setName("Gaming Laptop");
        p1.setPrice(new BigDecimal("5200.00"));
        p1.setStockQuantity(5);

        // Ponowne użycie getterów, żeby sprawdzić czy zmiany się zapisały
        System.out.println("New name after set: " + p1.getName());
        System.out.println("New price after set: " + p1.getPrice());
        System.out.println("New stock after set: " + p1.getStockQuantity());

        // 3. ToString i HashCode
        System.out.println("ToString p1: " + p1);
        System.out.println("p1 equals p2? " + p1.equals(p2));

        System.out.println("\nTEST PRODUCT2 (OnlyExplicitlyIncluded)\n");

        var p3 = new Product2("Keyboard", new BigDecimal("150.00"), 50);
        var p4 = new Product2("Keyboard", new BigDecimal("150.00"), 50);

        // 3. Test @ToString(onlyExplicitlyIncluded = true)
        // Wyświetli TYLKO te pola, nad którymi stoi @ToString.Include (czyli name i price).
        System.out.println("Product2 toString output:" + p3);

        // 4. Test @EqualsAndHashCode(onlyExplicitlyIncluded = true)
        System.out.println("p3 equals p4? " + p3.equals(p4));
    }
}
