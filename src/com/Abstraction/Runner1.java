package com.Abstraction;

public class Runner1
{
    public static void main(String[] args) {
        // We create an array of our interface type
        // This is "Polymorphism" in action!
        SmartDevices.ISmartDevice[] devices = {
                new SmartDevices.SmartLight(),
                new SmartDevices.AirConditioner(),
                new SmartDevices.SmartTV()
        };

        System.out.println("--- Booting up Smart Home ---");

        // Loop through all devices and turn them ON
        for (SmartDevices.ISmartDevice device : devices) {
            device.turnOn();
        }

        System.out.println("\n--- Night Mode Initiated ---");

        // Loop through all devices and turn them OFF
        for (SmartDevices.ISmartDevice device : devices) {
            device.turnOff();
        }
    }
}
