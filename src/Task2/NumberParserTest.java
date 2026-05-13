package Task2;

public class NumberParserTest {
    public static void main(String[] args) {
        System.out.println(NumberParser.parsePositiveInt("123"));
        System.out.println(NumberParser.parsePositiveInt("a"));
        System.out.println(NumberParser.parsePositiveInt("-123"));
    }
}
