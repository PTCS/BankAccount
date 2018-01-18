public class BankAccountWithdrawTester{
    public static void main(String[] args){
	BankAccount b1 = new BankAccount();
	b1.deposit(9.49);
	b1.withdraw(1.48);
	System.out.println(b1.getBalance());
    }
}
