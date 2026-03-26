package com.ExceptionHandling;

public class Bike implements Vehicle
{

    @Override
    public void Run()
    {
        System.out.println("Bike Runs on Two Wheels...");
    }
    public void Engine()
    {
        System.out.println("It has a small Engine than the Car...");
    }
}
