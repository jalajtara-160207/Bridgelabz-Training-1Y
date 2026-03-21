package com.Encapsulation;

public class Runner3
{
    static void main() {
        BankingSystem acc1 = new SavingAccount("SA001", "Alice", 10000);
        BankingSystem acc2 = new CurrentAccount("CA001", "Bob", 20000);

        acc1.Deposit(2000);
        acc1.WithDraw(1500);
        acc1.calculateInterest();

        acc2.Deposit(5000);
        acc2.WithDraw(10000);
        acc2.calculateInterest();

        // Loanable demonstration
        LoanAccount loanAcc = new LoanAccount("LA001", "Charlie", 6000);
        loanAcc.ApplyForLoan(20000);
        loanAcc.CalculateInterest();

        System.out.println("Final Balance of Alice: " + acc1.getBalance());
        System.out.println("Final Balance of Bob: " + acc2.getBalance());
        System.out.println("Final Balance of Charlie: " + loanAcc.getBalance());
    }

}

