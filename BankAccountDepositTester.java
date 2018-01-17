public class BankAccountDepositTester {
    public static void main(String[] args) {
    	BankAccount b = new BankAccount();
	b.deposit(9.99);
	b.deposit(8.88);
	System.out.println(b.getBalance());
	System.out.println(b.getBalance() == 18.87);    
    }
}
