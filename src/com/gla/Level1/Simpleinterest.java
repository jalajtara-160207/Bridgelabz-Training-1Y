package com.gla.Level1;
import java.util.Scanner;
public class Simpleinterest {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The PRincipal (Amount),time,and rate::\n");
        float p = in.nextFloat();
        float r = in.nextFloat();
        float t = in.nextFloat();
        CalculateSimpleInterest(p,r,t);
    }
    public static void CalculateSimpleInterest(float x,float y,float z)
    {
        float SI;
        SI=(x*y*z)/100;
        System.out.println("\nSimple Interest = "+SI);
    }
}
