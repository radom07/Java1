public class Task18 {
    public static void main(String[] args) {
        Product[] products = {
                new Product("PlayStation 5", Category.ELECTRONICS),
                new Product("Sushi", Category.FOOD),
                new Product("iPhone 12", Category.ELECTRONICS),
                new Product("Pizza", Category.FOOD),
                new Product("Jacket", Category.CLOTHING),
        };

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
