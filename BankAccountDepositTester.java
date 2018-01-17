public class BankAccountDepositTester {
   public static void main (String[] args){
	BankAccount ba = new BankAccount();
	System.out.println(ba.getBalance());
	ba.deposit(100.25);
	System.out.println(ba.getBalance());
   }

}
