import java.util.*;

public class NestedTwoKeyHashMap<K1, K2, V> implements TwoKeyMap<K1, K2, V> {

    private final Map<K1, Map<K2, V>> nestedMap = new HashMap<>();

    @Override
    public V put(K1 k1, K2 k2, V value) {
        Objects.requireNonNull(k1, "Key1 cannot be null");
        Objects.requireNonNull(k2, "Key2 cannot be null");
        Objects.requireNonNull(value, "Value cannot be null");

        return this.nestedMap
                .computeIfAbsent(k1, k -> new HashMap<>())
                .put(k2, value);
    }

    @Override
    public V get(K1 k1, K2 k2) {
        Objects.requireNonNull(k1, "Key1 cannot be null");
        Objects.requireNonNull(k2, "Key2 cannot be null");

        Map<K2, V> internalMap = this.nestedMap.get(k1);
        if (internalMap == null) {
            return null;
        }
        return internalMap.get(k2);
    }

    @Override
    public V remove(K1 k1, K2 k2) {
        Objects.requireNonNull(k1, "Key1 cannot be null");
        Objects.requireNonNull(k2, "Key2 cannot be null");

        Map<K2, V> internalMap = this.nestedMap.get(k1);
        if (internalMap == null) {
            return null;
        }
        V removed = internalMap.remove(k2);
        if (internalMap.isEmpty()) {
            this.nestedMap.remove(k1);
        }
        return removed;
    }

    @Override
    public boolean containsKeys(K1 k1, K2 k2) {
        Objects.requireNonNull(k1, "Key1 cannot be null");
        Objects.requireNonNull(k2, "Key2 cannot be null");

        Map<K2, V> internalMap = this.nestedMap.get(k1);
        if (internalMap == null) {
            return false;
        }
        return internalMap.containsKey(k2);
    }

    @Override
    public boolean containsValue(V value) {
        Objects.requireNonNull(value, "Value cannot be null");

        for (Map<K2, V> internalMap : nestedMap.values())
            if (internalMap.containsValue(value)) {
                return true;
            }
        return false;
    }

    @Override
    public int size() {
        return this.nestedMap.values()
                .stream()
                .mapToInt(Map::size)
                .sum();
    }

    @Override
    public boolean isEmpty() {
        return this.nestedMap.isEmpty();
    }

    @Override
    public Set<Entry<K1, K2, V>> entrySet() {
        Set<Entry<K1, K2, V>> resultSet = new HashSet<>();

        for (Map.Entry<K1, Map<K2, V>> row : this.nestedMap.entrySet()) {
            K1 k1 = row.getKey();
            Map<K2, V> internalMap = row.getValue();

            for (Map.Entry<K2, V> cell : internalMap.entrySet()) {
                K2 k2 = cell.getKey();
                V value = cell.getValue();

                resultSet.add(new MyEntry<>(k1, k2, value));
            }
        }
        return resultSet;
    }

    @Override
    public Set<Pair<K1, K2>> keySet() {
        Set<Pair<K1, K2>> resultSet = new HashSet<>();
        for (Map.Entry<K1, Map<K2, V>> row : this.nestedMap.entrySet()) {
            K1 k1 = row.getKey();
            Map<K2, V> internalMap = row.getValue();

            for (K2 k2 : internalMap.keySet()) {
                resultSet.add(new Pair<>(k1, k2));
            }
        }
        return resultSet;
    }

    @Override
    public Collection<V> values() {
        // Najpierw napisałem tak:
//        List<V> result = new ArrayList<>();
//        for (Map<K2, V> row : this.nestedMap.values()) {
//            for (Map.Entry<K2, V> cell : row.entrySet()) {
//                V value = cell.getValue();
//                result.add(value);
//            }
//        }
//        return result;
        // Można jeszcze tak korzystając z addAll:
//        for (Map<K2, V> row : this.nestedMap.values()) {
//            result.addAll(row.values());
//        }
        // A tutaj na strumieniu:
        return this.nestedMap.values()
                .stream()
                .flatMap(row -> row.values().stream())
                .toList();
    }
    //TODO
    @Override
    public void putAll(TwoKeyMap<? extends K1, ? extends K2, ? extends V> other) {

    }

    @Override
    public void clear() {
        nestedMap.clear();
    }
    //TODO
    @Override
    public Map<K2, V> row(K1 k1) {
        Objects.requireNonNull(k1, "Key1 cannot be null");

        return Map.of();
    }
    //TODO
    @Override
    public Map<K1, V> column(K2 k2) {
        Objects.requireNonNull(k2, "Key2 cannot be null");

        return Map.of();
    }

    @Override
    public Iterator<Entry<K1, K2, V>> iterator() {
        return entrySet().iterator();
    }

    private static class MyEntry<K1, K2, V> implements TwoKeyMap.Entry<K1, K2, V> {
        private final K1 key1;
        private final K2 key2;
        private V value;

        public MyEntry(K1 key1, K2 key2, V value) {
            this.key1 = key1;
            this.key2 = key2;
            this.value = value;
        }

        @Override public K1 getKey1() { return key1; }
        @Override public K2 getKey2() { return key2; }
        @Override public V getValue() { return value; }

        @Override
        public V setValue(V value) {
            Objects.requireNonNull(value, "Value cannot be null");
            V old = this.value;
            this.value = value;
            return old;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            MyEntry<?, ?, ?> myEntry = (MyEntry<?, ?, ?>) o;
            return Objects.equals(key1, myEntry.key1) && Objects.equals(key2, myEntry.key2) && Objects.equals(value, myEntry.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key1, key2, value);
        }
    }
}
