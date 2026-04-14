import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("First array: " + Arrays.toString(arr1));
        int[] arr2 = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        System.out.println("Second array: " + Arrays.toString(arr2));
        int[] arr3 = {100, 58, 74, 2, 5, 4444, 36, 8, 789, -1};
        System.out.println("Third array: " + Arrays.toString(arr3));

        System.out.println("Max element in first array: " + maxArray(arr1));
        System.out.println("Max element in second array: " + maxArray(arr2));
        System.out.println("Max element in third array: " + maxArray(arr3));
    }

    private static int maxArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
