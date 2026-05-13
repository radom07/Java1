package Task3;

import java.util.Arrays;

public final class Stats<T extends Number> {
    private final T[] data;

    public Stats(T[] data) {
        if (data == null || data.length == 0) {
            throw new IllegalArgumentException("Data cannot be null");
        }
        this.data = data;
    }

    public double mean() {
        double sum = 0;
        for (T t : data) {
            sum += t.doubleValue();
        }
        return sum / data.length;
    }

    public double variance() {
        double mean = mean();
        double sum = 0;
        for (T t : data) {
            sum += Math.pow(t.doubleValue() - mean, 2);
        }
        return sum / data.length;
    }

    public boolean hasSameMean(Stats<?> other, double eps) {
        return Math.abs(mean() - other.mean()) <= eps;
    }
}
