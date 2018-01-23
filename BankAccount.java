public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public double getBalance() {
        return balance;
    }
    public void withdraw(int num) {
	this.balance-=num;
    }
}
