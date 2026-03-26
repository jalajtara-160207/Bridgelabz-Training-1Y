package com.ExceptionHandling;
class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String Message)
    {
        super(Message);
    }
    public static class BankTransactionSystem
    {
        double Balance;

        public BankTransactionSystem(double initialBalance)
        {
            this.Balance = initialBalance;
        }
        public void withdraw(double amount)throws InsufficientBalanceException
        {
            if(amount<0)
            {
                throw new IllegalArgumentException("Invalid Amount!");
            }
            if(amount>Balance)
            {
                throw new InsufficientBalanceException("Insuffient Balance!");
            }
            Balance -= amount;
            System.out.println("WithDrawal Successful,New Balance:"+Balance);
        }
    }
    public static void main(String args[])
    {
        BankTransactionSystem Account = new BankTransactionSystem(1000);
        try
        {
            Account.withdraw(200);
            Account.withdraw(900);
            Account.withdraw(-50);
        }
        catch (InsufficientBalanceException i)
        {
            System.out.println(i.getMessage());
        }
        catch (IllegalArgumentException i)
        {
            System.out.println(i.getMessage());
        }
    }
}
