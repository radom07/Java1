package Task5;

import java.util.Arrays;

import static Task2.ArrayUtils.swap;

public class ArrayUtilsTestTask5 {
    public static void main(String[] args) {
        // 1. Wystąpienia z null i duplikatami
        String[] s = {null, "a", null, "b", "a"};
        System.out.println("s = " + Arrays.toString(s));
        System.out.println("indexOf(s, null): " + ArrayUtilsTask5.indexOf(s, null));
        System.out.println("lastIndexOf(s, null): " + ArrayUtilsTask5.lastIndexOf(s, null));
        System.out.println("indexOf(s, \"a\"): " + ArrayUtilsTask5.indexOf(s, "a"));
        System.out.println("indexOf(s, \"a\"): " + ArrayUtilsTask5.lastIndexOf(s, "a"));

        // 2. Brak elementu
        String[] ss = {"x", "y"};
        System.out.println("indexOf(ss, \"zzz\"): " + ArrayUtilsTask5.indexOf(ss, "zzz"));
    }
}
