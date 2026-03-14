package com.gla.Level2;
import java.util.Scanner;
public class Leapyear {
    public static boolean isleapyear(int year)
    {
        if(year%400==0)
        {
            return true;
        }
        else if(year%100==0)
        {
            return false;
        }
        else
        {
            return year%4==0;
        }
    }
    public static void main(String args[])
    {
        Scanner jt = new Scanner(System.in);
        System.out.println("Enter The Year: ");
        int a = jt.nextInt();
        if(isleapyear(a))
        {
            System.out.println("The Given is a Leap Year !");
        }
        else {
            System.out.println("The Given is not a Leap Year !");
        }
    }
}
