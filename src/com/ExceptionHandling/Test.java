package com.ExceptionHandling;

import java.lang.reflect.Array;

public class Test {
    public static void arithmeticException() {
        try {
            int a = 10;
            int b = 0;

            double result = a / b;
            System.out.println(result);

        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
    public static void nullpointerException()
    {
        try {
            String s1 = null;
            String s2 = null;
            System.out.println(s1.equals(s2));
        }
        catch(NullPointerException e1)
        {
            System.out.println(e1);
        }
    }

    public static void ArrayIndexOutOfBound()
    {
        try{
        int arr[]={1,2,3,4,5};
        System.out.println(arr[5]);}
        catch(ArrayIndexOutOfBoundsException e2)
        {
            System.out.println(e2);
        }
    }

    static void main() {
        arithmeticException();
        nullpointerException();
        ArrayIndexOutOfBound();
    }
}
