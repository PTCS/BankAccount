public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
