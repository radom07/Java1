public class Task13 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        for (Operation operation : Operation.values()) {
            int calculationResult = operation.calculate(a, b);
            System.out.println(operation + " " + a + " and " + b + " = " + calculationResult);
        }
    }
}
