package com.gla.Level1;
import java.util.Scanner;
public interface Quotient {
    public static int getQuotient(int dividend,int divisor)
    {
        return dividend/divisor;
    }
    public static int getremainder(int dividend,int divisor)
    {
        return dividend%divisor;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend: ");
        int a = sc.nextInt();
        System.out.println("Enter Divisor: ");
        int b = sc.nextInt();

        int quotient = getQuotient(30,5);
        int remainder = getremainder(40,5);
        System.out.println("Quotient = "+ quotient);
        System.out.println("Remainder = "+ remainder);
    }
}
