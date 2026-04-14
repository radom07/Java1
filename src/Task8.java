public class Task8 {
    public static void main(String[] args) {
        System.out.print("Enter first number for factorial: ");
        int firstNumber = Input.getInt();
        System.out.print("Enter second number for factorial: ");
        int secondNumber = Input.getInt();
        System.out.print("Enter third number for factorial: ");
        int thirdNumber = Input.getInt();
        System.out.println("Factorial " + firstNumber + " by iteration: " + factorialIteration(firstNumber));
        System.out.println("Factorial " + secondNumber + " by iteration: " + factorialIteration(secondNumber));
        System.out.println("Factorial " + thirdNumber + " by iteration: " + factorialIteration(thirdNumber));
    }

    private static int factorialIteration(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
