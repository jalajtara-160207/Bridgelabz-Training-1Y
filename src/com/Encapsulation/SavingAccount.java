package com.Encapsulation;

public class SavingAccount extends BankingSystem
{
    private double interestRate = 0.04;
    public SavingAccount(String AccountNumber,String HolderName,double Balance)
    {
        super(AccountNumber,HolderName,Balance);
    }

    @Override
    public void calculateInterest() {

    }

    @Override
    public void CalculateInterest()
    {
        double Interest = getBalance() * interestRate;
        setBalance(getBalance()+Interest);
        System.out.println("Savings Account Interest Added: "+Interest);
    }
}

class CurrentAccount extends BankingSystem
{
    private double interestRate = 0.02;

    public CurrentAccount(String accountNumber, String holderName, double balance)
    {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {

    }

    @Override
    public void CalculateInterest()
    {
        double interest = getBalance() * interestRate;
        setBalance(getBalance()+interest);
        System.out.println("Current Account Interest Added: "+interest);
    }
}

interface Loanable
{
    void ApplyForLoan(double Amount);
    boolean CalculateLoanelEligibility();

    boolean CalculateLoanEligibility();
}
