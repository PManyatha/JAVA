//package BankAccount;
//import java.util.ArrayList;
//
//class BankAccount{
//    String accountNumber;
//    double balance;
//
//    public BankAccount( String accountNumber,double balance) {
//        this.accountNumber=accountNumber;
//        this.balance=balance;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public void deposit(double amount){
//        if(amount > 0)
//            balance+=amount;
//    }
//
//
//}
//
//public class Bank {
//   private ArrayList<BankAccount> accounts = new ArrayList<>();
//
//
//    public void addAccount(BankAccount account){
//       accounts.add(account);
//
//   }
//
//   public void removeAccount(String accountNumber){
//       for(BankAccount account:accounts){
//           if(account.getAccountNumber().equals(accountNumber)){
//               accounts.remove(account);
//           }
//
//       }
//
//   }
//
//    public BankAccount getAccount(String accountNumber){
//        for(BankAccount account:accounts) {
//            if (account.getAccountNumber().equals(accountNumber)) {
//                return account;
//            }
//        }
//        return null;
//    }
//
//    public void deposit(String accountNumber, double depositAmount){
//       BankAccount account=getAccount(accountNumber);
//       if(account!=null){
//           account.deposit(depositAmount);
//           System.out.println("Deposited amount is");
//        }
//
//    }
//
//}
//
