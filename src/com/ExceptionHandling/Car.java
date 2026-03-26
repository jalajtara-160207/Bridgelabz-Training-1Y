package com.ExceptionHandling;

public class Car implements Vehicle
{
    @Override
    public void Run()
    {
        System.out.println("Car Runs On Four Wheels...");
    }
    public void Engine()
    {
        System.out.println("Engine is the Main Part of the Car...");
    }
}
