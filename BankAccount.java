import java.util.Random;

// import java.util.*;
public class BankAccount {

    private double checkingBalance;
    private double savingBalance;
    private int accountNumber;

    // class member that has the number of accounts created
    public static int numberOfAccounts = 0;

    // class member to track money in every account created
    public static double moneyInAllAccounts = 0;


    // static method to generate account number 
    public static int generateAccountNum() {
        Random accountNumGenerator = new Random();
        int randomnum =accountNumGenerator.nextInt(2500) + 1000000;
        return randomnum;
    }


    public BankAccount() {
        BankAccount.numberOfAccounts += 1;
        this.checkingBalance = 0;
        this.savingBalance = 0;
        this.accountNumber = BankAccount.generateAccountNum();
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    public double getSavingsBalance() {
        return this.savingBalance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    
    public void depositMoney(double amount, String account ) {
        if(account.equals("savings"))
            this.savingBalance += amount;
        else if(account.equals("checking"))
            this.checkingBalance += amount;
        BankAccount.moneyInAllAccounts += amount;

    }


    public void withdrawMoney(double amount, String account) {
        boolean successful = false; // why do I need this here 
        if(account.equals("savings")) {
            if(this.savingBalance - amount >= 0) {
                successful = true;
                this.savingBalance -= amount;
            }
        }
        else if(account.equals("checking")) {
            if (this.checkingBalance -amount >= 0) {
                successful = true;
                this.checkingBalance -=amount;
            }
        }
        if(successful) {
            BankAccount.moneyInAllAccounts -= amount;
        }
    else {
        System.out.println("Insufficient Funds. ");
    }
            
    }

    public void displayAccountBalance() {
        System.out.println(String.format("Savings: %.2f Checking: %.2f", this.savingBalance, this.checkingBalance));
    }


        

        

    


    

    
    

}
