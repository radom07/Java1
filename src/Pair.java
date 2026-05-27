import java.util.Objects;

public record Pair<K1, K2> (K1 key1, K2 key2) {

    public Pair {
        Objects.requireNonNull(key1, "Key1 cannot be null");
        Objects.requireNonNull(key2, "Key2 cannot be null");
    }
}
