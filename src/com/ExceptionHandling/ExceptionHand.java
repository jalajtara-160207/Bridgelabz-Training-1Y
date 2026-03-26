package com.ExceptionHandling;

public class ExceptionHand
{
    static void main()
    {
        try
        {
        int a=10/0;
        System.out.println(a);
        String s = null;
        System.out.println(s.length());
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Executed Successfully.....");
        }
    }
}