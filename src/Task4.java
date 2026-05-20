import java.util.Scanner;
import java.util.function.BiFunction;

public class Task4 {

    static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> op) {
        return op.apply(a, b);
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        BiFunction<Integer, Integer, Integer> sub = (a, b) -> a - b;
        BiFunction<Integer, Integer, Integer> mul = (a, b) -> a * b;
        BiFunction<Integer, Integer, Integer> div = (a, b) -> a / b;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter operator (+ - * /): ");
        String op = sc.next();
        sc.close();
        // walidacja b nie może być 0, ale nie ma tego w treści zadania

        BiFunction<Integer, Integer, Integer> chosen = switch (op) {
            case "+" -> add;
            case "-" -> sub;
            case "*" -> mul;
            case "/" -> div;
            default -> throw new IllegalArgumentException("Unknown operator: " + op);
        };

        System.out.println("Result: " + calculate(a, b, chosen));
    }
}
