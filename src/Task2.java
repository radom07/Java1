public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        int firstNumber = Input.getInt();
        System.out.print("Enter second number: ");
        int secondNumber = Input.getInt();
        int result = mult(firstNumber, secondNumber);
        System.out.println("Multiplication result: " + result);
    }

    private static int mult(int a, int b) {
        return a * b;
    }
}