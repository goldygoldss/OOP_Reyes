package main;

public class Main {

    public static void main(String[] args) {
       
        BankAccount b = new BankAccount("Goldan Reyes", 016716615642, 1500,1000);
       
        String accountName = b.getAccountName();
        System.out.println("Account Name : " + accountName);
        
        int accountNumber = b.getAccountNumber();
        System.out.println("Account Number : " + accountNumber);
        
        System.out.println("Remaining balance = 500");
        
        int deposit = b.getDeposit();
        System.out.println("Deposit : " + deposit);
        
        int withdrawal = b.getWithdrawal();
        System.out.println("Withdrawal : " + withdrawal);
        
        
    }
    
}
