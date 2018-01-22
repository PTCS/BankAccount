public class BankAccountDepositTester extends BankAccount{
    public static void main(String[] args){
	BankAccount b = new BankAccount();
	b.deposit(10);
	double a=b.getBalance();
	System.out.println(a);
    }
}
