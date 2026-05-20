import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Task9 {

    static void printReport(Map<String, Integer> map, BiConsumer<String, Integer> consumer) {
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            consumer.accept(e.getKey(), e.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> productToQty = new HashMap<>();
        productToQty.put("Laptop", 5);
        productToQty.put("TV", 12);
        productToQty.put("Speakers", 7);

        BiConsumer<String, Integer> reporter = (product, qty) -> System.out.println("Product name: " + product + ", Quantity: " + qty);

        System.out.println("Report:");
        printReport(productToQty, reporter);
    }
}
