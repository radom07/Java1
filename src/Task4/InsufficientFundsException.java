package Task4;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(Long id, long balanceGr, long amountGr) {
        super("Account ID: " + id + " insufficient funds! Balance: " + balanceGr + ", Requested: " + amountGr);
    }
}
