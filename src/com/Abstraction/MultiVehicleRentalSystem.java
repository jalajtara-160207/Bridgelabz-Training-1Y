package com.Abstraction;

public class MultiVehicleRentalSystem
{
    interface VehicleRental
    {
        void Rent();
        void ReturnVehicle();
    }
    static class Car implements VehicleRental {
        public Car() {
        }

        @Override
        public void Rent()
        {
            System.out.println("Car Has Been Rented.");
        }

        @Override
        public void ReturnVehicle()
        {
            System.out.println("Car Has Been Returned.");
        }

    }

    static class Bike implements VehicleRental
    {
        @Override
        public void Rent()
        {
            System.out.println("Bike Has Been Rented.");
        }
        @Override
        public void ReturnVehicle()
        {
            System.out.println("Bike Has Been Returned.");
        }
    }
    static class Bus implements VehicleRental
    {
        @Override
        public void Rent()
        {
            System.out.println("Bus Has Been Rented.");
        }
        @Override
        public void ReturnVehicle()
        {
            System.out.println("Bus Has Been Returned.");
        }
    }
}
