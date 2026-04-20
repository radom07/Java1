public class Task12 {
    public static void main(String[] args) {
        for (Currency currency : Currency.values()) {
            System.out.println(currency + " " + currency.getSymbol());
        }
    }
}
