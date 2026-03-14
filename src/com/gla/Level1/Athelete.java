package com.gla.Level1;
import java.util.Scanner;
public class Athelete {
    public static double calculatePerimeter(double a,double b,double c)
    {
        return a+b+c;
    }
    public static int calculateRounds(double perimeter,double targetDistance)
    {
        return(int)Math.ceil(targetDistance/perimeter);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Side a (in meteres): ");
        double a = sc.nextInt();
        System.out.println("Enter The Side b (in meteres): ");
        double b = sc.nextInt();
        System.out.println("Enter The Side c (in meteres): ");
        double c = sc.nextInt();
        double perimeter = calculatePerimeter(a,b,c);
        int rounds = calculateRounds(perimeter,5000);
        System.out.println("The athelete must Complete" +rounds+ "roundsto run 5 km.");
    }

}
