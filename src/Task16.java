import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        int[] numbers = {123, 4005, 9, 999};
        System.out.println("Numbers for test: " + Arrays.toString(numbers));

        for (int num : numbers) {
            System.out.println("Digits sum of \"" + num + "\": " + digitSumRecursion(num));
        }
    }

    public static int digitSumRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + digitSumRecursion(n / 10);
    }
}