public class TestBankAccount {
    
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount();
        System.out.println("This account number is:  " + bank1.getAccountNumber());


        bank1.depositMoney(100.00, "checking");
        bank1.depositMoney(25.99, "savings");
        System.out.println(bank1.getCheckingBalance());
        System.out.println(bank1.getSavingsBalance());
        System.out.println("Overall Banks Balance: " + BankAccount.moneyInAllAccounts);
        System.out.println("Number of Bank Accounts:  " + BankAccount.numberOfAccounts);

        bank1.withdrawMoney(10.00, "savings");
        bank1.withdrawMoney(16.00, "savings");
        System.out.println(bank1.getSavingsBalance());
        bank1.displayAccountBalance();

        


    }


}
