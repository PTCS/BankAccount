
public class BankAccountDepositTester extends BankAccount {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.deposit(1.23);
		b.deposit(2.34);
		System.out.println(b.getBalance());
	}
}