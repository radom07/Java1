package Task2;

import java.util.Arrays;

import static Task2.ArrayUtils.swap;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        // 1. Przestawienie elementów
        String[] a = {"A", "B", "C"};
        System.out.println("a = [\"A\", \"B\", \"C\"] -> " + Arrays.toString(a));
        swap(a, 0, 2);
        System.out.println("After swap(a, 0, 2) -> " + Arrays.toString(a));

        // 2. Walidacja indeksów
        Integer[] nums = {1, 2, 3};
        System.out.println("nums = {1, 2, 3} -> " + Arrays.toString(nums));
        try {
            swap(nums, -1, 0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("swap(nums, -1, 0) -> IndexOutOfBoundsException 1x / " + e.getMessage());
        }
        try {
            swap(nums, 0, 3);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("swap(nums, 0, 3) -> IndexOutOfBoundsException 2x / " + e.getMessage());
        }

        // 3. No-op
        String[] x = {"X", "Y"};
        System.out.println("x = [\"X\", \"Y\"] -> " + Arrays.toString(x));
        swap(x, 1, 1);
        System.out.println("swap(x, 1, 1) -> " + Arrays.toString(x));
    }
}
