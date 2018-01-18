public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit) {
	balance += deposit;
    }
    public void withdraw(double withdraw) {
	balance -= withdraw;
    }

}
