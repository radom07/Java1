import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task13 {

    record Product(String name, double price, int rating) {}

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(List.of(
                new Product("Mouse",        89.99, 4),
                new Product("Keyboard", 199.00, 5),
                new Product("Mouse pro",    89.99, 5),
                new Product("Headphones",  349.00, 3),
                new Product("Mat",        89.99, 3)
        ));

        Comparator<Product> sort = Comparator.comparingDouble(Product::price)
                .thenComparing(Comparator.comparingInt(Product::rating).reversed());

        products.sort(sort);
        products.forEach(System.out::println);
    }
}
