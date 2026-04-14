public class Task3 {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        int firstNumber = Input.getInt();
        System.out.print("Enter second number: ");
        int secondNumber = Input.getInt();
        int result = max(firstNumber, secondNumber);
        System.out.println("Max number: " + result);
    }

    private static int max(int a, int b) {
        return Integer.max(a, b);
    }
}