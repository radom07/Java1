package Task3;

final class BankAccount {
    private int balance;

    public BankAccount(int initial) {
        this.balance = initial;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Amount exceeds balance, amount: " + amount + ", balance: " + balance);
        }
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}