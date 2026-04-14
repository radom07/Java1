public class Task9 {
    public static void main(String[] args) {
        System.out.print("Enter first number for factorial: ");
        int firstNumber = Input.getInt();
        System.out.print("Enter second number for factorial: ");
        int secondNumber = Input.getInt();
        System.out.print("Enter third number for factorial: ");
        int thirdNumber = Input.getInt();
        System.out.println("Factorial " + firstNumber + " by recursion: " + factorialRecursion(firstNumber));
        System.out.println("Factorial " + secondNumber + " by recursion: " + factorialRecursion(secondNumber));
        System.out.println("Factorial " + thirdNumber + " by recursion: " + factorialRecursion(thirdNumber));
    }

    private static int factorialRecursion(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * factorialRecursion(number - 1);
        }
    }
}
