package Task7;

public class TripleTest {
    public static void main(String[] args) {
        // 1. Równość
        Triple<String, Integer, Boolean> t1 = Triple.of("id", 42, true);
        Triple<String, Integer, Boolean> t2 = Triple.of("id", 42, true);
        Triple<String, Integer, Boolean> t3 = Triple.of("id", 43, true);
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
        System.out.println("t1.equals(t2) = " + t1.equals(t2));
        System.out.println("t1.equals(t3) = " + t1.equals(t3));

        // 2. Akcesory
        Triple<String, Integer, Boolean> t = Triple.of("id", 42, true);
        System.out.println("t.first() = " + t.first());
        System.out.println("t.second() = " + t.second());
        System.out.println("t.third() = " + t.third());

        // 3. toString()
        Triple<String, String, String> triple = Triple.of("A", "B", "C");
        System.out.println("toString() = " + triple);
    }
}
