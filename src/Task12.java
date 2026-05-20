public class Task12 {

    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }

    public static void main(String[] args) {

        TriFunction<Double, Double, Double, Double> weightedAverage = (grade, weight, sumWeight) -> grade * weight / sumWeight;

        double[] grades = {3.0, 4.5, 5.0};
        double[] weights  = {1.0, 2.0, 3.0};

        double sumWeight = 0;
        for (double w : weights) {
            sumWeight += w;
        }

        double average = 0;
        for (int i = 0; i < grades.length; i++) {
            average += weightedAverage.apply(grades[i], weights[i], sumWeight);
        }
        System.out.println("Weighted average: " + average);
    }
}
