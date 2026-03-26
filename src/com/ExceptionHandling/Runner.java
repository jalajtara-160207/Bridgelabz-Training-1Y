package com.ExceptionHandling;

public class Runner
{
    static void main()
    {
        Vehicle v1 =  new Car();
        v1.Run();
        Vehicle v2 = new Bike();
        v2.Run();
    }
}
