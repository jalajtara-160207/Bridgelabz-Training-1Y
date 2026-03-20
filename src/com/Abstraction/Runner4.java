package com.Abstraction;

public class Runner4
{
    public static void main(String[] args) {
        SmartVehicle.Vehicle car = new SmartVehicle.Car(80);
        SmartVehicle.Vehicle electricCar = new SmartVehicle.ElectricCar(100, 75);

        car.displaySpeed();
        car.displayBatteryPercentage(); // Uses default method

        electricCar.displaySpeed();
        electricCar.displayBatteryPercentage(); // Uses overridden method
    }

}
