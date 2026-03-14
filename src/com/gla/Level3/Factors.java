package com.gla.Level3;
import java.util.Scanner;
public class Factors {
    public static int[] findfactors(int num)//method to find factors
    {
        int count = 0;
        for(int i=1;i<=num;i++)
        {
            if(num % i == 0)
            {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                factors[index++]=i;
            }
        }
        return factors;
    }
    public static void printfactors(int[] factors)//to print factors
    {
        System.out.println("Factors: ");
        for(int f:factors)
        {
            System.out.println(f+" ");
        }
        System.out.println();
    }
    public static int sumfactors(int[]factors)//to find the sum of factors
    {
        int sum=0;
        for(int f:factors)
        {
            sum+=f;
        }
        return sum;
    }
    public static long productfactors(int[]factors)//to find the product
    {
        long product = 1;
        for(int f:factors)
        {
            product*=f;
        }
        return product;
    }
    public static int countfactors(int[]factors)
    {
        return factors.length;
    }
    public static void main(String[] args)
    {
        Scanner jt = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = jt.nextInt();
        int[] factors = findfactors(a);
        System.out.println("Sum of Factors: " + sumfactors(factors));
        System.out.println("Product of Factors: " + productfactors(factors));
        System.out.println("Number of Factors: " + countfactors(factors));
    }
}
