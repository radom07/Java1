public class Task11 {
    public static void main(String[] args) {
        System.out.print("Enter text: ");
        String text = Input.sc.nextLine();

        System.out.println("Length of text: " + text.length());
        System.out.println("Text in upper case: " + text.toUpperCase());
        System.out.println("Text in lower case: " + text.toLowerCase());
        System.out.println("Text reversed: " + new StringBuilder(text).reverse());
    }
}
