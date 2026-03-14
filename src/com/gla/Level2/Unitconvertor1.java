package com.gla.Level2;

public class Unitconvertor1 {
    public static double meterToKilometers(double meters)
    {
        return meters/1000.0;
    }
    public static double kilometerTometers(double kilometers)
    {
        return kilometers*1000.0;
    }
    public static double inchesTocentimeters(double inches)
    {
        return inches*2.54;
    }
    public static double centimeterToinches(double cm)
    {
        return cm/2.54;
    }
public static void main(String args[])
{
    System.out.println("10 meters = " + meterToKilometers(10) + " km");
    System.out.println("5 km = " + kilometerTometers(5) + " m");
    System.out.println("12 meters = " + inchesTocentimeters(12) + " cm");
    System.out.println("20 meters = " + centimeterToinches(20) + " inches");
}

}
