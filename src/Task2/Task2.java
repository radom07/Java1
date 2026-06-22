package Task2;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {
        final int arraySize = 1_000_000;
//        final int arraySize = 1000 // dla małej tablicy
        final int[] array = generateRandomArray(arraySize);

        // 1. Obliczenie sekwencyjne
        long startTimeSeq = System.nanoTime();
        int sequentialSum = computeSequentialSum(array);
        long endTimeSeq = System.nanoTime();

        System.out.printf("Sequential sum: %d (Time: %.2f ms)%n",
                sequentialSum, (endTimeSeq - startTimeSeq) / 1_000_000.0);

        // 2. Obliczenie wielowątkowe
        final int threadsCount = 4;
        long startTimePar = System.nanoTime();
        long parallelSum = computeParallelSum(array, threadsCount);
        long endTimePar = System.nanoTime();

        System.out.printf("Parallel sum:  %d (Time: %.2f ms)%n",
                parallelSum, (endTimePar - startTimePar) / 1_000_000.0);

        System.out.println("Results are the same? " + (sequentialSum == parallelSum));
    }

    private static int[] generateRandomArray(int size) {
        var random = new Random();
        return random.ints(size, 1, 100).toArray();
    }

    private static int computeSequentialSum(int[] array) {
//        lub typ zwracany long i return Arrays.stream(array).asLongStream().sum();
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    private static long computeParallelSum(int[] array, int threadsCount) throws InterruptedException {
        var threads = new Thread[threadsCount];
        // Każdy wątek zapisuje do swojego "pudełka", brak współdzielenia modyfikowalnej zmiennej
        final long[] partialSums = new long[threadsCount];
        final int chunkSize = array.length / threadsCount;

        for (int i = 0; i < threadsCount; i++) {
            final int threadIndex = i;
            final int start = threadIndex * chunkSize;
            // Obsługa sytuacji, gdy rozmiar tablicy nie jest idealnie podzielny przez liczbę wątków
            final int end = (threadIndex == threadsCount - 1) ? array.length : start + chunkSize;

            // Tworzymy wątek
            threads[i] = new Thread(() -> {
                long sum = 0;
                for (int j = start; j < end; j++) {
                    sum += array[j];
                }
                partialSums[threadIndex] = sum;
            });
            threads[i].start();
        }

        // Czekamy na zakończenie wszystkich wątków
        for (var thread : threads) {
            thread.join();
        }

        // Sumujemy wyniki częściowe
        return Arrays.stream(partialSums).sum();
    }
}
