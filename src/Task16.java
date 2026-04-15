public class Task16 {
    public static void main() {
        System.out.print("Enter text: ");
        String text = Input.sc.nextLine();

        boolean startsWith = text.startsWith("Java");
        boolean endsWith = text.endsWith("2025");

        System.out.println("Text starts with 'Java'? " + startsWith);
        System.out.println("Text ends with '2025'? " + endsWith);
    }
}
