package com.gla.string;
import java.util.Scanner;
public class StringQ1L2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String: ");
        String str = sc.next();
        int length = 0;
        for(char ch : str.toCharArray())
        {
            length++;
        }
        System.out.println("The Length of the String is :"+length);
    }
}
