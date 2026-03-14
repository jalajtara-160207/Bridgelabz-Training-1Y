package com.gla.Level2;

public class Unitconvertor2 {
    public static double yardTofeet(double yard)
    {
        return yard*3;
    }
    public static double feetToyard(double yard)
    {
        return yard/3;
    }
    public static double metersToinches(double m)
    {
        return m*39.3701;
    }
    public static double inchesTometers(double inches)
    {
        return inches/0.0254;
    }
    public static void main(String args[])
    {
        System.out.println("10 yard = " + yardTofeet(10) + " feet");
        System.out.println("5 feet = " + feetToyard(5) + " yards");
        System.out.println("12 meters = " + metersToinches(12) + " inches");
        System.out.println("20 inches = " + inchesTometers(20) + " meters");
    }

}
