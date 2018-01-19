public class BankAccountDepositTester {

    public static void main(String[] args) {
	BankAccount account = new BankAccount();
	account.deposit(20);
	account.deposit(100);
	account.deposit(10.10);
	System.out.println(account.getBalance());
    }
}
