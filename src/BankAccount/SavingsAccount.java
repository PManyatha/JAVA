package BankAccount;

public class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(int accountnumber, double accountbalance, double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    @Override
    public String displayAccountDetails() {
        return super.displayAccountDetails() + ", Interest Rate: " + interestRate + "%";

    }

    @Override
    public boolean withdraw(double amount) {
        return false;
    }


    @Override
    public boolean deposit(double amount) {
        return false;
    }


    public void earnInterest()
     {
         double interest = accountbalance * (interestRate/100);
         accountbalance += interest;
         System.out.printf("Interest earned: %.2f%nNew account balance: %.2f%n", interest, accountbalance);
     }
}
