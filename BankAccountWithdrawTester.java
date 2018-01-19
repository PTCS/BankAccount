public class BankAccountWithdrawTester {
    public static void main(String[] args) {
	BankAccount account = new BankAccount();
	account.withdraw(100);
	account.withdraw(0.1);
	System.out.println(account.getBalance());
    }
}
