//Create a Java program that performs array operations.
//       ● Accept an integer array and an index number.
//        ● Retrieve and print the value at that index.
//● Handle the following exceptions:
//○ ArrayIndexOutOfBoundsException if the index is out of range.
//○ NullPointerException if the array is null.
package com.ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MultipleCatchBlock
{
        public static void main(String args[])
        {
            Scanner jt = new Scanner(System.in);
            try
            {
                System.out.println("Enter the Size of the Array..");
                int size = jt.nextInt();
                int arr[] = new int[size];
                System.out.println("Enter"+size+"Integer Elements in the Array:-");
                for(int i=0;i<size;i++)
                {
                    arr[i] = jt.nextInt();
                }
                System.out.print("Enter the Index Which to be Retrived from the Array:- ");
                int index = jt.nextInt();
                int value = arr[index];
                System.out.println("Value at index " + index + " is: " + value);
            }
            catch (ArrayIndexOutOfBoundsException a)
            {
                System.out.println("Error:-Index is out of Range.");
            }
            catch (NullPointerException n)
            {
                System.out.println("Error:The Array is Empty or Null.");
            }
            catch (InputMismatchException i)
            {
                System.out.println("Error:Please Enter A Valid Integer.");
            }
            finally
            {
                jt.close();
                System.out.println("Program Executed Successfully.");
            }
        }
}
