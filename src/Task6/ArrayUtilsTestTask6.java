package Task6;

import Task5.ArrayUtilsTask5;

import java.util.Arrays;

public class ArrayUtilsTestTask6 {
    public static void main(String[] args) {
        // 1. Równe tablice z null
        Integer[] a = {1, null, 3};
        Integer[] b = {1, null, 3};
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println("arraysEqual(a, b): " + ArrayUtilsTask6.arraysEqual(a, b));

        // 2. Różne tablice
        Integer[] c = {1, 2, 3};
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("c = " + Arrays.toString(c));
        System.out.println("arraysEqual(a, c): " + ArrayUtilsTask6.arraysEqual(a, c));

        // 3. Obsługa null wejściowego
        String[] d = {"x"};
        System.out.println("d = " + Arrays.toString(d));
        System.out.println("e = null");
        System.out.println("arraysEqual(d, e): " + ArrayUtilsTask6.arraysEqual(d, null));
        System.out.println("arraysEqual(null, null): " + ArrayUtilsTask6.arraysEqual(null, null));
    }
}
