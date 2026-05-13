package Task2;

public final class ArrayUtils {
    private ArrayUtils() {
    }

    public static <T> void swap(T[] arr, int i, int j) {
        if (arr == null) {
            throw new NullPointerException("Array cannot be null");
        }
        if (i < 0 || j < 0 || i >= arr.length || j >= arr.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (i == j) {
            return;
        }

        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
