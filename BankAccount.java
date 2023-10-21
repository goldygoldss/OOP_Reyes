package main;

public class BankAccount {

        private String accountName;     
        private int accountNumber;              
        private int deposit, withdrawal;
         
        BankAccount(String accountName, int accountNumber, int deposit, int withdrawal){
            this.accountName   = accountName;
            this.accountNumber = accountNumber;
            this.deposit       = deposit;
            this.withdrawal    = withdrawal;
            
        }
        String getAccountName(){
            return accountName;
        }
        int getAccountNumber(){
            return accountNumber;
        }
        int getDeposit(){
            System.out.println("Your Balance : " + deposit);
            return deposit;
        }
        int getWithdrawal(){
            System.out.println(deposit - withdrawal);
            
            return withdrawal;
            
        }
        
}
       
      


     
    
    

