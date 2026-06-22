package Task4.Bank;

import Task4.BankAccount.BankAccount;

import java.util.concurrent.ConcurrentHashMap;

public class BankSync {

    private final ConcurrentHashMap<Long, BankAccount> accounts = new ConcurrentHashMap<>();

    public void openAccount(long id, long initialPln) {
        accounts.putIfAbsent(id, new BankAccount(id, initialPln));
    }

    public void transfer(long fromId, long toId, long amountGr) {
        if (fromId == toId) return;

        BankAccount a = accounts.get(fromId);
        BankAccount b = accounts.get(toId);

        if (a == null || b == null) {
            throw new IllegalArgumentException("One of the accounts does not exist");
        }

        BankAccount first = (a.getId() < b.getId()) ? a : b;
        BankAccount second = (a.getId() < b.getId()) ? b : a;
        synchronized (first) {
            synchronized (second) {
                a.withdraw(amountGr);
                b.deposit(amountGr);
            }
        }
    }

    public long totalBalanceGr() {
        return accounts.values().stream().mapToLong(BankAccount::getBalanceGr).sum();
    }

    public ConcurrentHashMap<Long, BankAccount> getAccounts() {
        return accounts;
    }
}
