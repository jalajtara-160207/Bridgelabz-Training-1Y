package com.gla.Level1;
import java.util.Scanner;
public class Largestnumber {
    public static int findsmallest(int a,int b,int c)
    {
        int smallest = a;
        if(b<smallest)smallest = b;
        if(c<smallest)smallest = c;
        return smallest;
    }
    public static int findlargest(int a,int b,int c)
    {
        int largest = a;
        if(b>largest) largest = b;
        if(c>largest) largest = c;
        return largest;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter The second Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter The third Number: ");
        int num3 = sc.nextInt();

        int smallest = findsmallest(num1,num2,num3);
        int largest = findlargest(num1,num2,num3);

        System.out.println("Smallest number = "+smallest);
        System.out.println("Largest number = "+largest);
    }
}
