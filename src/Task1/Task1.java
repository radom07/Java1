package Task1;

import java.util.ArrayList;

public class Task1 {

//    private static final int N = 2000;
    private static final int N = 5;

    public static void main(String[] args) {
        var threads = new ArrayList<Thread>();

        System.out.println("Creating and starting threads...");
        for (int i = 1; i <= N; i++) {
            var thread = new Thread(new Loop(), Integer.toString(i));
            threads.add(thread);
            thread.start();
        }

        System.out.println("Waiting for threads to finish...");

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Main thread was interrupted!");
            }
        }
        System.out.println("All threads finished");
        System.out.println("Counter: " + Loop.counter);
    }
}
