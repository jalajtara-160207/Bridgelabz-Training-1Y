package com.ExceptionHandling;

public class Exp
{
    static void AgeChecker(int a) {
        if (a < 18)
        {
            throw new ArithmeticException("Invalid Age for Voting...");
        }
        System.out.println("Valid Age for Voting...");
    }

    static void main()
    {
        AgeChecker(19);
    }
}
