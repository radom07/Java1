package Task4.Bank;

import Task4.BankAccount.BankAccountLock;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class BankLock {

    private final ConcurrentHashMap<Long, BankAccountLock> accounts = new ConcurrentHashMap<>();

    public void openAccount(long id, long initialPln) {
        accounts.putIfAbsent(id, new BankAccountLock(id, initialPln));
    }

    public boolean transfer(long fromId, long toId, long amountGr) {
        BankAccountLock from = accounts.get(fromId);
        BankAccountLock to = accounts.get(toId);

        long deadline = System.currentTimeMillis() + 1000;
        while (System.currentTimeMillis() < deadline) {
            try {
                if (from.lock.tryLock(50, TimeUnit.MILLISECONDS)) {
                    try {
                        if (to.lock.tryLock(50, TimeUnit.MILLISECONDS)) {
                            try {
                                from.withdraw(amountGr);
                                to.deposit(amountGr);
                                return true;
                            } finally {
                                to.lock.unlock();
                            }
                        }
                    } finally {
                        from.lock.unlock();
                    }
                }

                Thread.sleep(1); // backoff

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        return false; // deadlock unikamy – po prostu rezygnujemy
    }

    public long totalBalanceGr() {
        return accounts.values().stream().mapToLong(BankAccountLock::getBalanceGr).sum();
    }

    public ConcurrentHashMap<Long, BankAccountLock> getAccounts() {
        return accounts;
    }
}
