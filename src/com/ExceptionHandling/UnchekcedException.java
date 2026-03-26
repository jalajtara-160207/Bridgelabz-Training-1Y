//Problem Statement:
//Write a Java program that asks the user to enter two numbers and divides them. Handle
//possible exceptions such as:
//● ArithmeticException if division by zero occurs.
//● InputMismatchException if the user enters a non-numeric value.
package com.ExceptionHandling;
import java.util.Scanner;
import java.util.InputMismatchException;
public class UnchekcedException
{
        public static void main(String args[])
        {
            Scanner jt = new Scanner(System.in);
            try
            {
                System.out.println("Enter The First Number:- ");
                double First_Number = jt.nextDouble();

                System.out.println("Enter The Second Number:- ");
                double Second_Number = jt.nextDouble();

                double res = First_Number/Second_Number;

                System.out.println("The Result is:-"+res);
            }
            catch (ArithmeticException a)
            {
                System.out.println("Error:Division By ZERO.");
            }
            catch (InputMismatchException i)
            {
                System.out.println("Please Enter NUmeric Data Only.");
            }
            finally
            {
                jt.close();
            }
        }
}
