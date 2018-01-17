public class BankAccountDepositTester {
    public static void main(String[] args) {
    	BankAccount b = new BankAccount();
        System.out.println(b.getBalance());
	b.deposit(5.5);
	System.out.println(b.getBalance());
    }
}
