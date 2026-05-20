public class Task14 {

    @FunctionalInterface
    interface PriceStrategy {
        double apply(double basePrice);
    }

    static double calculatePrice(double basePrice, PriceStrategy strategy) {
        return strategy.apply(basePrice);
    }

    public static void main(String[] args) {
        PriceStrategy normal = price -> price;
        PriceStrategy student = price -> price * 0.9;
        PriceStrategy vip = price -> price * 0.8;
        PriceStrategy blackFriday = price -> price * 0.7;

        double[] prices = {100.0, 250.0, 399.0};
        for (double price : prices) {
            System.out.println("Price: " + price + ", Normal: " + calculatePrice(price, normal) + ", Student: " + calculatePrice(price, student) + ", VIP: " + calculatePrice(price, vip) + ", Black Friday: " + calculatePrice(price, blackFriday));
        }
    }
}
