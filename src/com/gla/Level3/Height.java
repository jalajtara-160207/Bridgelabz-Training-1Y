package com.gla.Level3;
import java.util.Scanner;
public class Height {
    public static double findshortest(double[]heights)
    {
        double min = heights[0];
        for(double h : heights)
        {
            if(h<min)
            {
                min=h;
            }
        }
        return min;
    }
    public static double findtallest(double[]heights)
    {
        double max = heights[0];
        for(double h:heights)
        {
            if(h>max)
            {
                max=h;
            }
        }
        return max;
    }
    public static double findmean(double[]heights)
    {
        double sum=0;
        for(double h:heights)
        {
            sum+=h;
        }
        return sum/heights.length;
    }
    public static void main(String args[])
    {
        Scanner jt = new Scanner(System.in);
        System.out.println("Enter The Number of Players: ");
        int p = jt.nextInt();
        double[] heights = new double[p];
        System.out.println("Enter The Heights of The Players: ");
        for(int i=0;i<p;i++)
        {
            heights[i] = jt.nextDouble();
        }
        System.out.println("Shortest Height :" +findshortest(heights));
        System.out.println("Tallest Height :" +findtallest(heights));
        System.out.println("Mean Height :" +findmean(heights));
    }
}
