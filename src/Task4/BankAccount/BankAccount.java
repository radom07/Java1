package Task4.BankAccount;

import Task4.InsufficientFundsException;

public class BankAccount {
    private final Long id; // numer konta
    private long balanceGr; // w groszach

    public BankAccount(Long id, long initialPln) {
        this.id = id;
        this.balanceGr = initialPln * 100;
    }

    public synchronized void deposit(long amountGr) {
        if (amountGr <= 0) throw new IllegalArgumentException("Amount must be positive");
        balanceGr += amountGr;
    }

    public synchronized void withdraw(long amountGr) {
        if (amountGr <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (balanceGr < amountGr) throw new InsufficientFundsException(id, balanceGr, amountGr);
        balanceGr -= amountGr;
    }

    public synchronized long getBalanceGr() {
        return balanceGr;
    }

    public Long getId() {
        return id;
    }
}
