package com.Encapsulation;

public class Insurable
{
    interface Insuarble
    {
        double calculateInsurance();
        String getInsuranceDetails();
    }

    static class Car extends VehicleRent implements Insuarble
    {
        private String insurancePolicyNumber;

        public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber)
        {
            super(vehicleNumber, "Car", rentalRate);
            this.insurancePolicyNumber = insurancePolicyNumber;
        }

        public Car() {
            super();
        }

        @Override
        public double calculateRentalCost(int Days)
        {
            return getRentalRate() * Days;
        }

        @Override
        public double calculateInsurance()
        {
            return 2000;
        }

        @Override
        public String getInsuranceDetails()
        {
            return "Car Insurance Policy: " + insurancePolicyNumber;
        }

        @Override
        public void displayDetails(int Days)
        {
            super.DisplayDetails(Days);
            System.out.println(getInsuranceDetails());
            System.out.println("Insurance Cost: " + calculateInsurance());
        }
    }

    public static class Bus extends Car {
        public Bus(String b102, int i, String s) {
            super();
        }
    }

    public static class Truck extends Car {
        public Truck(String t103, int i, String s) {
        }
    }
}
