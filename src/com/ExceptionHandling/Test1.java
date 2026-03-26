package com.ExceptionHandling;

public class Test1 {
    public static void ArithmeticException()
    {
        try
        {
            int a=0;
            int b=8;
            double result = a/b;
            System.out.println(result);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("MAI HAR BAAR RUN KRUNGA!!!");
        }
    }
    public static void NullpointerException()
    {
        try
        {
            String s1 = "Null";
            String s2 = "Null";
            System.out.println(s1.equals(s2));
        }
        catch (NullPointerException e1)
        {
            System.out.println(e1);
        }
    }
    public static void ArrayOutOfBoundException()
    {
        try
        {
            int arr[] = {1,2,3,4,5};
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e2)
        {
            System.out.println(e2);
        }
        finally
        {
            System.out.println("MAI HAR BAAR RUN KRUNGA");
        }
    }

    static void main()
    {
        ArithmeticException();
        NullpointerException();
        ArrayOutOfBoundException();
    }
}
