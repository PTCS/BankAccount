public class BankAccountDepositTester
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount();
	account.deposit(700);
        System.out.println(account.getBalance());
    }
}
