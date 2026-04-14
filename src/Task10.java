import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Created array: " + Arrays.toString(arr));
        int arraySumResult = arraySum(arr);
        System.out.println("Sum of array: " + arraySumResult);
    }

    private static int arraySum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
