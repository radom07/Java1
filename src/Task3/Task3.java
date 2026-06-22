package Task3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class Task3 {

    private static final int K = 4; // Liczba wątków
    private static final int START = 1;
    private static final int END = 20;

    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(START, END)
                .boxed()
                .toList();

        List<Future<BigInteger>> futures = new ArrayList<>();

        try (var executor = Executors.newFixedThreadPool(K)) {

            System.out.println("Assigning tasks...");
            for (Integer number : numbers) {
                Factorial task = new Factorial(number);
                Future<BigInteger> future = executor.submit(task);
                futures.add(future);
            }

            System.out.println("All tasks assigned.");
            System.out.println("Receiving results (futures.get()):");

            for (int i = 0; i < futures.size(); i++) {
                int originalNumber = numbers.get(i);
                System.out.println(originalNumber + " -> " + futures.get(i).get());
            }

        } catch (InterruptedException e) {
            System.err.println("The main thread has been interrupted");
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            System.err.println("An error occurred during calculations in one of the threads: " + e.getCause());
        }

        // executor zamyka się automatycznie w tym miejscu dzięki try-with-resources
        System.out.println("Program finished.");
    }
}
