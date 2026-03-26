package com.ExceptionHandling;

public class ExceptionPropagationinMethods
{
        public static void method1()
        {
            int res = 10/0;
            System.out.println("Result:-"+res);
        }
        public static void method2()
        {
            method1();
        }
        public static void main(String args[])
        {
            try
            {
                method2();
            }
            catch (ArithmeticException a)
            {
                System.out.println("Handled Exception in the Main Class.");
            }
        }
}
