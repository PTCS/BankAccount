public class BankAccountWithdrawTester extends BankAccount {
        public static void main(String[] args) {
                BankAccount b = new BankAccount();
                b.withdraw(1.23);
                b.withdraw(2.34);
                System.out.println(b.getBalance());
        }
}

