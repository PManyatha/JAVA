package BankAccount;

public abstract class BankAccount {
    int accountnumber;
    double accountbalance;

    BankAccount(){
        accountbalance=0;
    }
    BankAccount(double accountbalance){
        this.accountbalance=accountbalance;
    }

    public double getAccountbalance() {
        return accountbalance;
    }

    public void setAccountbalance(double newbalance) {
        this.accountbalance=newbalance;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

//    public void deposit(double amount){
//        accountbalance+=amount;
//
//    }
//
//    public void withdraw(double amount){
//        if(accountbalance > amount){
//            accountbalance-=amount;
//        }
//        else {
//            System.out.println("Insufficient Account Balance");
//        }
//    }

    public String displayAccountDetails(){
        String message = "Account Number: " + accountnumber + "\n" + "Account Balance: $" + accountbalance;
        System.out.println(message);
        return message;
    }
    public abstract boolean withdraw(double amount);
    public abstract boolean deposit(double amount);

//    public static void main(String [] args){
//        BankAccount bank=new BankAccount();
//        System.out.println("Account Number: "+bank.accountnumber+" Account Balance"+bank.accountbalance);
//        BankAccount bank1=new BankAccount();
//        bank1.setAccountnumber(12345);
//        bank1.setAccountbalance(20000);
//
//        System.out.println("Account Number: "+bank1.getAccountnumber()+" Account Balance"+bank1.getAccountbalance());
//        bank1.deposit(2500);
//        System.out.println("Account Number: "+bank1.getAccountnumber()+" Account Balance"+bank1.getAccountbalance());
//        bank1.withdrow(300);
//        bank1.displayAccountDetails();
//    }
}
