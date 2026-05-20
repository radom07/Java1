import java.util.Scanner;
import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        Function<String, Integer> textLengthWithoutSpaces = s -> s.replaceAll(" ", "").length();
        Function<String, Integer> countVowels = s -> s.length() - s.replaceAll("[aeiouyAEIOUY]", "").length();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = sc.nextLine();
        sc.close();
        System.out.println("Text length without spaces: " + textLengthWithoutSpaces.apply(text));
        System.out.println("Number of vowels: " + countVowels.apply(text));
    }
}
