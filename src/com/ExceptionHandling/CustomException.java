package com.ExceptionHandling;
class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message)
    {
         super(message);
    }
}




public class CustomException
{
    static void ageChecker(int a) throws InvalidAgeException
    {
        if(a<18)
        {
            throw new InvalidAgeException("Invalid Age");
        }
        else
        {
            System.out.println("Valid Age for Voting.");
        }
    }

    static void main()
    {
        try
        {
            ageChecker(20);
        }
        catch(InvalidAgeException a )
        {
            System.out.println(a);
        }
    }
}



//super:- keyword parent class ki methods call krta hai
//super():- method parent class ki constructor call krta hai