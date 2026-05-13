package Task6;

public final class ArrayUtilsTask6 {
    private ArrayUtilsTask6() {
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

    public static <T> int indexOf(T[] arr, T value) {
        if (arr == null) {
            throw new NullPointerException("Array cannot be null");
        }
        if (value == null) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == null) {
                    return i;
                }
            }
        }
        if (value != null) {
            for (int i = 0; i < arr.length; i++) {
                if (value.equals(arr[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static <T> int lastIndexOf(T[] arr, T value) {
        if (arr == null) {
            throw new NullPointerException("Array cannot be null");
        }
        if (value == null) {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == null) {
                    return i;
                }
            }
        }
        if (value != null) {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (value.equals(arr[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static <T> boolean arraysEqual(T[] a, T[] b) {
        if (a == b) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                if (b[i] != null) {
                    return false;
                }
            } else {
                if (!a[i].equals(b[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
