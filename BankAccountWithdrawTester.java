public class BankAccountWithdrawTester {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
	ba.deposit(20.00);
	ba.withdraw(5.00);
	System.out.println(ba.getBalance());
	System.out.println(ba.getBalance() == 15.00);
    }
}
