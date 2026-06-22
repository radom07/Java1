package Task4.BankAccount;

import Task4.InsufficientFundsException;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccountLock {
    private final Long id;
    private long balanceGr;

    public final ReentrantLock lock = new ReentrantLock();

    public BankAccountLock(Long id, long initialPln) {
        this.id = id;
        this.balanceGr = initialPln * 100;
    }

    public void deposit(long amountGr) {
        if (amountGr <= 0) throw new IllegalArgumentException("Amount must be positive");
        balanceGr += amountGr;
    }

    public void withdraw(long amountGr) {
        if (amountGr <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (balanceGr < amountGr) throw new InsufficientFundsException(id, balanceGr, amountGr);
        balanceGr -= amountGr;
    }

    public long getBalanceGr() {
        lock.lock();
        try {
            return balanceGr;
        } finally {
            lock.unlock();
        }
    }

    public Long getId() {
        return id;
    }
}
