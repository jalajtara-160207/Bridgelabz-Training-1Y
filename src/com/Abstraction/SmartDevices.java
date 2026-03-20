package com.Abstraction;

public class SmartDevices
{
    interface ISmartDevice
    {
        void turnOn();
        void turnOff();
    }

        static class SmartLight implements ISmartDevice
        {
        @Override
        public void turnOn()
        {
            System.out.println("Light: [ON] - Brightness at 100%");
        }

        @Override
        public void turnOff()
        {
            System.out.println("Light: [OFF]");
        }
    }

    static class AirConditioner implements ISmartDevice
    {
        @Override
        public void turnOn()
        {
            System.out.println("AC: [ON] - Cooling to 22°C");
        }

        @Override
        public void turnOff()
        {
            System.out.println("AC: [OFF] - Entering energy-saving mode");
        }
    }

    static class SmartTV implements ISmartDevice
    {
        @Override
        public void turnOn()
        {
            System.out.println("TV: [ON] - Welcome back! Opening Netflix...");
        }

        @Override
        public void turnOff()
        {
            System.out.println("TV: [OFF] - Screen turning black");
        }
    }
}
