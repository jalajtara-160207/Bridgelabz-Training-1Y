package com.ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class FinallyBlockExecution
{
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            try
            {
                System.out.print("Enter the First Integer: ");
                int First_Number = scanner.nextInt();
                System.out.print("Enter the Second Integer: ");
                int Second_Number = scanner.nextInt();
                int result = First_Number / Second_Number;
                System.out.println("Result: " + result);
            }
            catch (ArithmeticException a)
            {
                System.out.println("Error: Division by zero is not allowed.");
            }
            catch (InputMismatchException i)
            {
                System.out.println("Error: Please enter valid integers.");
            }
            finally
            {
                System.out.println("Operation completed");
                scanner.close();
            }
        }

}
