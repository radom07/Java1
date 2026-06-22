package Task4;

import Task4.Bank.BankAtomic;
import Task4.Bank.BankLock;
import Task4.Bank.BankSync;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static final long NUMBER_OF_ACCOUNTS = 10;
    private static final long AMOUNT_GR = 1000;
    private static final int NUMBER_OF_THREADS = 8;
    private static final int NUMBER_OF_TRANSFERS = 1000;

    public static void main(String[] args) {
        BankSync bank = new BankSync();
//        BankLock bank = new BankLock();
//        BankAtomic bank = new BankAtomic();
        for (long i = 1; i <= NUMBER_OF_ACCOUNTS; i++) bank.openAccount(i, AMOUNT_GR);

        ExecutorService pool = Executors.newFixedThreadPool(NUMBER_OF_THREADS); // można w try with resources wtedy niepotrzebny shutdown
        Random rng = new Random(42);

        CompletableFuture<?>[] futures = new CompletableFuture<?>[1000];
        for (int i = 0; i < 1000; i++) {
            long from = 1 + rng.nextInt(10);
            long to;
            do {
                to = 1 + rng.nextInt(10);
            } while (to == from);
            long amountGr = (100 + rng.nextInt(401)) * 100L;
            final long fromF = from, toF = to, amountF = amountGr;
            futures[i] = CompletableFuture.runAsync(() -> {
                try {
                    bank.transfer(fromF, toF, amountF);
                } catch (InsufficientFundsException e) { /* OK – niewystarczające środki */ }
            }, pool);
        }

        CompletableFuture.allOf(futures).join();

        System.out.println("Stan kont po zakończeniu operacji");
        bank.getAccounts().values().forEach(account ->
                System.out.printf("Konto ID: %2d | Saldo: %8.2f PLN (%d gr)%n",
                        account.getId(),
                        account.getBalanceGr() / 100.0,
                        account.getBalanceGr()
                )
        );

        long total = bank.totalBalanceGr();
        System.out.println("Suma sald: " + total + " gr (powinno: " + (10 * 1000 * 100L) + ")");
        if (total != 10 * 1000 * 100L) {
            throw new AssertionError("NIEZMIENNIK ZŁAMANY – jest race condition!");
        }

        pool.shutdown();
    }


}
