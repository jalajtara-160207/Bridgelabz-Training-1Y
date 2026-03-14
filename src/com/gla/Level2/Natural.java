package com.gla.Level2;
import java.util.Scanner;
public class Natural {
    public static int recursivesum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return n + recursivesum(n-1);
        }
    }
    public static int formulasum(int n)
    {
        return n*(n+1)/2;
    }
    public static void main(String args[])
    {
        Scanner jt = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = jt.nextInt();
        int sumrecursive = recursivesum(a);
        int sumformula = formulasum(a);
        System.out.println("Sum of first " +a+ " natural numbers(recursive):"+sumrecursive);
        System.out.println("Sum of first " +a+ " natural numbers(formula):"+sumformula);
        if(sumrecursive==sumformula)
        {
            System.out.println("The Result is Correct.");
        }
        else
        {
            System.out.println("Results Don't Match..");
        }
    }


}
