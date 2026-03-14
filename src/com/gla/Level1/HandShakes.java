package com.gla.Level1;
import java.util.Scanner;
public class HandShakes {
    public static int countHandShakes(int n)
    {
        return (n*(n-1))/2;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int a = in.nextInt();
        System.out.println("Total HandShakes:"+countHandShakes(a));
    }
}
