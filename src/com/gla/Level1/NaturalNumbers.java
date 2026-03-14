package com.gla.Level1;
import java.util.Scanner;
public class NaturalNumbers {
    public static int calculatesum(int n)
    {
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Positive Number n: ");
        int n = sc.nextInt();

        int res = calculatesum(n);
        System.out.println("Sum of first " + n +"natural numbers = " + res);
    }
}
