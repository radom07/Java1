import java.util.Optional;

public class Task1 {

    public static void main(String[] args) {
        Optional<String> opt1 = Optional.of("true");
        Optional<String> opt2 = Optional.ofNullable("true");
        Optional<String> opt3 = Optional.empty();

        System.out.println("opt1: present = " + opt1.isPresent() + ", empty = " + opt1.isEmpty());
        System.out.println("opt2: present = " + opt2.isPresent() + ", empty = " + opt2.isEmpty());
        System.out.println("opt3: present = " + opt3.isPresent() + ", empty = " + opt3.isEmpty());

        /*
        3.
        Optional<String> optTest = Optional.of(null);
        rzuca NPE bo metoda fabryczna of używa pod spodem requireNonNull, a tam sprawdza if == null to throw NPE

        public static <T> Optional<T> of(T value) {
        return new Optional<>(Objects.requireNonNull(value));
    }
        public static <T> T requireNonNull(T obj) {
        if (obj == null)
            throw new NullPointerException();
        return obj;
    }
        4.
        ofNullable jeśli value == null to ustawia optional empty

        public static <T> Optional<T> ofNullable(T value) {
        return value == null ? (Optional<T>) EMPTY
                             : new Optional<>(value);
         */
    }
}
