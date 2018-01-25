public class BankAccountWithdrawTester {
  public static void main (String [] args){
     BankAccount b = new BankAccount();
     b.deposit(15);
     b.withdraw(5);
     System.out.println(b.getBalance());
  }
}
