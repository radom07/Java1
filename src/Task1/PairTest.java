package Task1;

public class PairTest {
    public static void main(String[] args) {
        // 1. Równość i hashCode
        Pair<Integer, String> p1 = Pair.of(1, "a");
        Pair<Integer, String> p2 = Pair.of(1, "a");
        Pair<Integer, String> p3 = Pair.of(1, "b");

        System.out.println("p1.equals(p2) = " + p1.equals(p2));
        System.out.println("p1.equals(p3) = " + p1.equals(p3));
        System.out.println("p1.hashCode() = " + p1.hashCode());
        System.out.println("p2.hashCode() = " + p2.hashCode());
        System.out.println("hashCode p1 == p2 = " + (p1.hashCode() == p2.hashCode()));

        // 2. Obsługa null
        Pair<Object, String> p = Pair.of(null, "x");
        System.out.println("p.first() = " + p.first());
        System.out.println("p.toString() = " + p);

        // 3. Niemutowalność
        Pair<String, String> pairAB = Pair.of("A", "B");
        // Brak setterów
        // Pola final
    }
}
