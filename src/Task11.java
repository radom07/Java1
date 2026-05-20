public class Task11 {

    @FunctionalInterface
    interface StringFormatter {
        String format(String input);
    }

    static String applyFormat(String text, StringFormatter formatter) {
        return formatter.format(text);
    }

    public static void main(String[] args) {
        StringFormatter toUpperCase = String::toUpperCase;
        StringFormatter prefix = s -> ">>> " + s;
        StringFormatter reverse = s -> new StringBuilder(s).reverse().toString();

        String text = "Java";

        System.out.println("toUpperCase: " + applyFormat(text, toUpperCase));
        System.out.println("prefix: " + applyFormat(text, prefix));
        System.out.println("reverse: " + applyFormat(text, reverse));
    }
}
