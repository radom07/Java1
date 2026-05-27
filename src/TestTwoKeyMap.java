import java.util.Set;

public class TestTwoKeyMap {
    public static void main(String[] args) {

        TwoKeyMap<String, String, Integer> grades = new NestedTwoKeyHashMap<>();
        System.out.println("isEmpty should be \"true\" >>> " + grades.isEmpty());
        System.out.println("size should be \"0\" >>> " + grades.size());

        System.out.println();

        System.out.println("grades.put(\"Alice\", \"Math\", 5)");
        System.out.println("grades.put(\"Alice\", \"CS\", 4)");
        System.out.println("grades.put(null, \"CS\", 4)");
        grades.put("Alice", "Math", 5);
        grades.put("Alice", "CS", 4);
        try {
            grades.put(null, "CS", 4);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        System.out.println("grades.get(\"Alice\", \"Math\") should be \"5\" >>> " + grades.get("Alice", "Math"));
        System.out.println("grades.get(\"Alice\", \"CS\") should be \"4\" >>> " + grades.get("Alice", "CS"));
        System.out.println("grades.get(\"Alice\", \"Example\") should be \"null\" >>> " + grades.get("Alice", "Example"));
        System.out.println("grades.get(\"Jack\", \"CS\") should be \"null\" >>> " + grades.get("Jack", "CS"));
        System.out.print("grades.get(null, \"CS\") should be \"NPE\" >>> ");
        try {
            System.out.print(grades.get(null, "CS"));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        System.out.println("isEmpty should be \"false\" >>> " + grades.isEmpty());
        System.out.println("size should be \"2\" >>> " + grades.size());

        System.out.println();

        System.out.println("grades.remove(\"Alice\", \"Math\") should be 5 >>> " + grades.remove("Alice", "Math"));
        System.out.println("grades.remove(\"Jack\", \"Math\") should be \"null\" >>> " + grades.remove("Jack", "Math"));
        System.out.println("grades.remove(\"Alice\", \"Sad\") should be \"null\" >>> " + grades.remove("Alice", "Sad"));
        System.out.println("grades.get(\"Alice\", \"Math\") should be \"null\" >>> " + grades.get("Alice", "Math"));
        System.out.println("grades.get(\"Alice\", \"CS\") should be \"4\" >>> " + grades.get("Alice", "CS"));
        System.out.println("grades.remove(\"Alice\", \"CS\") should be \"4\" >>> " + grades.remove("Alice", "CS"));
        // Tu musi już usunąć klucz Alice, bo nie ma innych, jak to sprawdzić?
        System.out.println("grades.get(\"Alice\", \"CS\") should be \"null\" >>> " + grades.get("Alice", "CS"));

        System.out.println();

        System.out.println("grades.containsKeys(\"Alice\", \"Math\") should be \"false\" >>> " + grades.containsKeys("Alice", "Math"));
        System.out.println("grades.containsValue(5) should be \"false\" >>> " + grades.containsValue(5));

        System.out.println();

        System.out.println("grades.put(\"Alice\", \"Math\", 5)");
        System.out.println("grades.put(\"Alice\", \"CS\", 4)");
        grades.put("Alice", "Math", 5);
        grades.put("Alice", "CS", 4);

        System.out.println();

        System.out.println("grades.containsKeys(\"Alice\", \"Math\") should be \"true\" >>> " + grades.containsKeys("Alice", "Math"));
        System.out.println("grades.containsValue(5) should be \"true\" >>> " + grades.containsValue(5));

        System.out.println();

        System.out.println("Set<TwoKeyMap.Entry<String, String, Integer>> entrySet = grades.entrySet() and sout with forEach");
        Set<TwoKeyMap.Entry<String, String, Integer>> entrySet = grades.entrySet();
        entrySet.forEach(entry -> System.out.println("Key1: " + entry.getKey1() + ", Key2: " + entry.getKey2() + ", Value: " + entry.getValue()));

        System.out.println();

        System.out.println("grades.values() + forEach with sout");
        grades.values().forEach(value -> System.out.println("Value: " + value));

        System.out.println();

        System.out.println("grades.keySet() + forEach with sout");
        grades.keySet().forEach(key -> System.out.println("Key: " + key));

        System.out.println("\nIterator test with forEach");
        for (TwoKeyMap.Entry<String, String, Integer> entry : grades) {
            System.out.println("Name: " + entry.getKey1() + ", Subject: " + entry.getKey2() + ", Grade: " + entry.getValue());
        }

        System.out.println();

        System.out.println("grades.row(\"Alice\") should be {Math=5, CS=4} >>> " + grades.row("Alice"));
        System.out.println("grades.row(\"Jack\") should be emptyMap >>> " + grades.row("Jack"));

        System.out.println();

        System.out.println("grades.put(\"Bob\", \"Math\", 4)");
        grades.put("Bob", "Math", 4);
        System.out.println("grades.column(\"Math\") should be {Alice=5, Bob=4} >>> " + grades.column("Math"));
        System.out.println("grades.column(\"Geo\") should be emptyMap >>> " + grades.column("Geo"));

        System.out.println();

        System.out.println("TwoKeyMap<String, String, Integer> otherMap = new NestedTwoKeyHashMap<>()");
        TwoKeyMap<String, String, Integer> otherMap = new NestedTwoKeyHashMap<>();
        System.out.println("otherMap.put(\"Sara\", \"Math\", 5)");
        System.out.println("otherMap.put(\"Sara\", \"CS\", 4)");
        System.out.println("otherMap.put(\"Albert\", \"Geo\", 3)");
        otherMap.put("Sara", "Math", 5);
        otherMap.put("Sara", "CS", 4);
        otherMap.put("Albert", "Geo", 3);
        System.out.println("grades.putAll(otherMap)");
        grades.putAll(otherMap);
        System.out.println("Set<TwoKeyMap.Entry<String, String, Integer>> mergedMap = grades.entrySet() and sout with forEach");
        Set<TwoKeyMap.Entry<String, String, Integer>> mergedMap = grades.entrySet();
        mergedMap.forEach(entry -> System.out.println("Key1: " + entry.getKey1() + ", Key2: " + entry.getKey2() + ", Value: " + entry.getValue()));
        // można przetestować próbę putAll na mapie z innymi typami i zobaczyć czy poprawnie zadzaiała ? extends

        System.out.println();

        System.out.println("grades.clear()");
        grades.clear();
        System.out.println("isEmpty should be \"true\" >>> " + grades.isEmpty());
    }
}