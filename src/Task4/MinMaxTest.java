package Task4;

import Task1.Pair;

public class MinMaxTest {
    public static void main(String[] args) {
        // 1. Ciąg znaków
        String[] s = {"aa", "b", "ccc"};
        Pair<String, String> minMax = MinMax.minMax(s);
        System.out.println("minMax(s) = (min = " + minMax.first() + ", max = " + minMax.second() + ")");

        // 2. Liczby całkowite
        Integer[] a = {5, 5, -1, 10, 10};
        Pair<Integer, Integer> integerPair = MinMax.minMax(a);
        System.out.println("minMax(a) = (min = " + integerPair.first() + ", max = " + integerPair.second() + ")");

        // 3. Pojedynczy element
        Integer[] x = {42};
        Pair<Integer, Integer> singleElementPair = MinMax.minMax(x);
        System.out.println("minMax(x) = (min = " + singleElementPair.first() + ", max = " + singleElementPair.second() + ")");

        // 4. Elementy null (jeśli zabronione)
        try {
            Integer[] arr = {1, null, 2};
            Pair<Integer, Integer> nullArray = MinMax.minMax(arr);
            System.out.println("minMax(arr) = (min = " + nullArray.first() + ", max = " + nullArray.second() + ")");
        } catch (IllegalArgumentException e) {
            System.out.println("minMax(arr) -> IllegalArgumentException / " + e.getMessage());
        }
    }
}
