//Create a method calculateInterest(double amount, double rate, int years) that:
//● Throws IllegalArgumentException if amount or rate is negative.
//● Propagates the exception using throws and handles it in main().
//Expected Behavior:
//● If valid, return and print the calculated interest.
//● If invalid, catch and display "Invalid input: Amount and rate must be positive".
package com.ExceptionHandling;

public class Throw
{
    public static double calculateInterest(double amount,double rate,int yrs) throws IllegalArgumentException
    {
        if(amount<0 || rate<0)
        {
            throw new IllegalArgumentException("Amount and Rate Must Be Positive.");
        }
        return (amount * rate * yrs)/100;
    }
    public static void main(String args[])
    {
        try
        {
            double interest = calculateInterest(100,-5,3);
            System.out.println("Calculated Interest is :-"+interest);
            double invalidInterest = calculateInterest(1000,4,2);
            System.out.println("Calculated Interest is :-"+invalidInterest);
        }
        catch (IllegalArgumentException i)
        {
            System.out.println("Invalid Input: Amount And Rate must be Positive.");
        }
    }
}
