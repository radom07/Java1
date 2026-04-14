import java.util.Arrays;
import java.util.stream.IntStream;

public class Task14 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("First array: " + Arrays.toString(arr1));
        int[] arr2 = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        System.out.println("Second array: " + Arrays.toString(arr2));
        int[] merged = merge(arr1, arr2);
        System.out.println("Merged array: " + Arrays.toString(merged));
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int[] result = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
        return result;
    }
}
