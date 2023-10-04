import java.util.*;
public class RunSavingsAccount {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();

        System.out.print("Enter the interest rate: ");
        double interestRate = scanner.nextDouble();
        SavingsAccount.setInterestRate(interestRate);

        System.out.print("Enter an initial deposit amount: ");
        double initialDeposit = scanner.nextDouble();
        savings.deposit(initialDeposit);

        char choice;
        do {
            System.out.print("Press D to deposit, W to withdraw, or Q to quit: ");
            choice = scanner.next().charAt(0);

            if (choice == 'D' || choice == 'd') {
                System.out.print("Enter the deposit amount: ");
                double depositAmount = scanner.nextDouble();
                savings.deposit(depositAmount);
            } else if (choice == 'W' || choice == 'w') {
                System.out.print("Enter the withdrawal amount: ");
                double withdrawalAmount = scanner.nextDouble();
                double withdrawn = savings.withdraw(withdrawalAmount);
                if (withdrawn == 0) {
                    System.out.println("Insufficient funds. Withdrawal canceled.");
                } else {
                    System.out.println("Withdrawn: $" + withdrawn);
                }
            }

            SavingsAccount.showBalance(savings);

        } while (choice != 'Q' && choice != 'q');

        if (savings.getBalance() > 1000) {
            savings.addInterest();
            System.out.println("New balance with applied interest: $" + savings.getBalance());
        }

        
      
    }
    
}
