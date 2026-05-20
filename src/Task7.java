import java.util.Scanner;
import java.util.function.BiPredicate;

public class Task7 {

    public static void main(String[] args) {

        BiPredicate<String, String> sameIgnoreCase = String::equalsIgnoreCase;
        BiPredicate<String, String> isSuffix = String::endsWith;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String first = sc.nextLine();
        System.out.println("Enter second string: ");
        String second = sc.nextLine();
        sc.close();

        System.out.println("Strings are equal ignoring case: " + sameIgnoreCase.test(first, second));
        System.out.println("Second string is a suffix of the first: " + isSuffix.test(first, second));
    }
}
