package Task1;

import java.util.concurrent.atomic.AtomicInteger;

public class Loop implements Runnable {
    public static final AtomicInteger counter = new AtomicInteger(0);

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " started");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
//            counter++;
            counter.incrementAndGet();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread " + Thread.currentThread().getName() + " interrupted.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
