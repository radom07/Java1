public class Task19 {
    public static void main(String[] args) {
        int additionResult = Calculation.ADD.calculate(10, 20);
        int subtractionResult = Calculation.SUBTRACT.calculate(50, 10);
        int multiplicationResult = Calculation.MULTIPLY.calculate(10, 20);
        int divisionResult = Calculation.DIVIDE.calculate(100, 20);

        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);
    }
}
