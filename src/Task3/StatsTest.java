package Task3;

public class StatsTest {
    public static void main(String[] args) {
        // 1. Średnia i wariancja (Integer)
        Integer[] a = {1, 2, 3, 4};
        Stats<Integer> stats = new Stats<>(a);
        System.out.println("stats.mean() = " + stats.mean());
        System.out.println("stats.variance() = " + stats.variance());

        // 2. Porównanie średnich z tolerancją
        Double[] x = {2.0, 2.0};
        Double[] y = {2.001, 1.999};
        double eps = 0.01;
        Stats<Double> statsX = new Stats<>(x);
        Stats<Double> statsY = new Stats<>(y);
        System.out.println("hasSameMean(x, y, eps) = " + statsX.hasSameMean(statsY, eps));

        // 3. Pusta tablica
        try {
            Stats<Integer> emptyStats = new Stats<>(new Integer[0]);
            System.out.println("emptyStats.mean() = " + emptyStats.mean());
        } catch (IllegalArgumentException e) {
            System.out.println("emptyStats.mean() -> IllegalArgumentException / " + e.getMessage());
        }

    }
}
