package com.Abstraction;

public class Runner2
{
    static void main()
    {
        MultiVehicleRentalSystem.VehicleRental Car = new MultiVehicleRentalSystem.Car();
        MultiVehicleRentalSystem.VehicleRental Bike = new MultiVehicleRentalSystem.Bike();
        MultiVehicleRentalSystem.VehicleRental Bus = new MultiVehicleRentalSystem.Bus();

        Car.Rent();
        Bike.Rent();
        Bus.Rent();

        Car.ReturnVehicle();
        Bike.ReturnVehicle();
        Bus.ReturnVehicle();
    }
}
