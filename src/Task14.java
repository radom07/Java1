public class Task14 {
    public static void main(String[] args) {
        System.out.print("Enter first text: ");
        String text1 = Input.sc.nextLine();
        System.out.print("Enter second text: ");
        String text2 = Input.sc.nextLine();

        boolean equalsResult = text1.equals(text2);
        boolean equalsIgnoreCase = text1.equalsIgnoreCase(text2);

        System.out.println("Text 1 equals text 2: " + equalsResult);
        System.out.println("Text 1 equals text 2 ignoring case: " + equalsIgnoreCase);
    }
}
