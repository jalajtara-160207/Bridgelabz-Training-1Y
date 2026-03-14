package com.gla.Level1;
import java.util.Scanner;
public class NumberCheck {
    public static String checknumber(int num)
    {
        if(num>0)
        {
            return "Positive";
        }
        else if(num<0)
        {
            return "Negative";
        }
        else
        {
            return "Zero";
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int number = sc.nextInt();
        String res = checknumber(number);
        System.out.println("The Number is "+ res);
    }
}
