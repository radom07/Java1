import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Task5 {
    public static void main(String[] args) {

        UnaryOperator<List<Integer>> removeNegatives = list -> {
            list.removeIf(i -> i < 0);
            return list;
        };

        BinaryOperator<Integer> maxOp = (a, b) -> a > b ? a : b;

        List<Integer> numbers = new ArrayList<>(List.of(3, -1, 7, -5, 10, 0));
        System.out.println("Original list: " + numbers);
        numbers = removeNegatives.apply(numbers);
        System.out.println("List with negative numbers removed: " + numbers);

        int max = numbers.getFirst();
        for (int i = 1; i < numbers.size(); i++) {
            max = maxOp.apply(max, numbers.get(i));
        }
        System.out.println("Max value: " + max);
    }
}
