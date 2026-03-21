package com.Encapsulation;

public class LoanAccount
{
    public LoanAccount(String la001, String charlie, int i) {
    }

    public void ApplyForLoan(int i) {
    }

    public void CalculateInterest() {
    }

    public String getBalance() {
        return "";
    }

    class loanAccount extends SavingAccount implements Loanable
    {
        public loanAccount(String AccountNumber, String HolderName, double Balance)
        {
            super(AccountNumber,HolderName,Balance);
        }
        @Override
        public void ApplyForLoan(double Amount)
        {
            if(CalculateLoanelEligibility())
            {
                System.out.println(getHolderName()+"Applied For Loan: "+Amount);
            }
            else
            {
                System.out.println(getHolderName()+"Is Not Eligible For Loan.");
            }
        }

        @Override
        public boolean CalculateLoanelEligibility() {
            return false;
        }

        @Override
        public boolean CalculateLoanEligibility()
        {
            return getBalance() >= 5000;
        }
    }
}
