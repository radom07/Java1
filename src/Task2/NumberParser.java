package Task2;

final class NumberParser {
    private NumberParser() {
    }

    static int parsePositiveInt(String s) {
        int parsedNumber;
        try {
            parsedNumber = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new InvalidNumberException("Invalid number: \"" + s + "\"", e);
        }
        if (parsedNumber <= 0) {
            throw new IllegalArgumentException("non-positive: " + parsedNumber);
        }
        return parsedNumber;
    }
}