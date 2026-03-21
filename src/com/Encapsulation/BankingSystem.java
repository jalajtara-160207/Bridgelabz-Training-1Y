package com.Encapsulation;

public abstract class BankingSystem
{
        String AccountNumber;
        String HolderName;
        double Balance;

    public BankingSystem(String accountNumber, String holderName, double balance)
    {
        this.AccountNumber = accountNumber;
        this.HolderName = holderName;
        this.Balance = balance;
    }
    public String getAccountNumber()
    {
        return AccountNumber;
    }
    public String getHolderName()
    {
        return HolderName;
    }
    public double getBalance()
    {
        return Balance;
    }

    public void setBalance(double Balance)
    {
        this.Balance = Balance;
    }

    public void Deposit(double Amount)
    {
        if(Amount>0)
        {
            Balance += Amount;
            System.out.println(HolderName+"Deposited: "+Amount);
        }
        else
        {
            System.out.println("INVALID DEPOSIT AMOUNT !");
        }
    }

    public void WithDraw(double Amount)
    {
        if(Amount>0&& Amount<=Balance)
        {
            Balance -= Amount;
            System.out.println(HolderName+"WithDrew: "+Amount);
        }
        else
        {
            System.out.println("INVALID WITHDRAWAL OR INSUFFICIENT FUNDS!");
        }
    }
    public abstract void calculateInterest();

    public abstract void CalculateInterest();
}
