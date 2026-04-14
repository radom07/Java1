public class Task5 {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        double firstNumber = Input.getDouble();
        System.out.print("Enter second number: ");
        double secondNumber = Input.getDouble();
        System.out.print("Enter third number: ");
        double thirdNumber = Input.getDouble();
        double result = average(firstNumber, secondNumber, thirdNumber);
        System.out.printf("Average: %.2f", result);
    }

        private static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}