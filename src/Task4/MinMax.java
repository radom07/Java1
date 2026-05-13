package Task4;

import Task1.Pair;

public final class MinMax {
    private MinMax() {
    }

    public static <T extends Comparable<? super T>> Pair<T, T> minMax(T[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        for (T element : arr) {
            if (element == null) {
                throw new IllegalArgumentException("Array cannot contain null elements");
            }
        }

        T min = arr[0];
        T max = arr[0];

        for (T element : arr) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return Pair.of(min, max);
    }
}
