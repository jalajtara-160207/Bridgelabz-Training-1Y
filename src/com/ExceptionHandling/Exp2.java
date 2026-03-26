package com.ExceptionHandling;

public class Exp2 {
    static void AgeChecker(int a) throws  ArithmeticException,NullPointerException
    {

        if (a < 18)
        {
            throw new ArithmeticException("Invalid Age for Voting...");
        }
        System.out.println("Valid Age for Voting...");
    }

    static void main()
    {
        try
        {
            AgeChecker(19);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
