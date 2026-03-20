package com.Abstraction;

public class SmartVehicle {
    interface Vehicle
    {
        void DisplaySpeed();
        default void displayBatteryPercentage()
        {
            System.out.println("Battery Feature not Avaialble for this Vehicle.");
        }

        void displaySpeed();
    }
    static class Car implements Vehicle
    {
        int Speed;
        public Car(int Speed)
        {
            this.Speed=Speed;
        }
        @Override
        public void DisplaySpeed()
        {
            System.out.println("Car Speed: "+Speed+"km/h");

        }

        @Override
        public void displaySpeed() {

        }
    }
    static class ElectricCar implements Vehicle
    {
        int Speed;
        int BatteryPerentage;

        public ElectricCar(int Speed, int BatteryPerentage)
        {
            this.Speed = Speed;
            this.BatteryPerentage = BatteryPerentage;
        }

        @Override
        public void DisplaySpeed() {
            System.out.println("Electric Car Speed: "+Speed+"km/h");
        }

        @Override
        public void displayBatteryPercentage() {
            System.out.println("Battery: "+BatteryPerentage+"%");
        }

        @Override
        public void displaySpeed() {

        }
    }
}
