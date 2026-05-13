package Task3;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        try {
            bankAccount.withdraw(101);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of transaction, balance: " + bankAccount.getBalance());
        }
    }
}
