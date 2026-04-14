import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        int[] numbers = {123, 4005, 9, 999};
        System.out.println("Numbers for test: " + Arrays.toString(numbers));

        for (int num : numbers) {
            System.out.println("Digits sum of \"" + num + "\": " + digitSumIteration(num));
        }
    }

    public static int digitSumIteration(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
