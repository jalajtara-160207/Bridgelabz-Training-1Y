package com.gla;
//Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
        //Hint =>
//a. Simple Interest = Principal * Rate * Time / 100
//b. Take user input for principal, rate, time
//c. Write a method to calculate the simple interest given principle, rate and time as
  //      parameters
//d. Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
public class Simpleinterest {
    public static void simpleinterest(double p,double r,double t)
    {
        double si = p*r*t/100;
        System.out.println("Simple Interest :- " +si);
    }

    static void main() {
        simpleinterest(2000,5,2);
    }
}
