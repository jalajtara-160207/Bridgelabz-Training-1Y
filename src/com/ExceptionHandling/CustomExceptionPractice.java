package com.ExceptionHandling;
class InvalidAgeException1 extends Exception
{
    public InvalidAgeException1(String Message)
    {
        super(Message);
    }
}



public class CustomExceptionPractice
{
    static void ageChecker1(int a) throws InvalidAgeException1
    {
        if(a<18)
        {
            throw new InvalidAgeException1("Invalid Age");
        }
        else
        {
            System.out.println("Valid for Voting.");
        }
    }

    static void main()
    {
        try
        {
            ageChecker1(20);
        }
        catch (InvalidAgeException1 A)
        {
            System.out.println(A);
        }
    }
}
