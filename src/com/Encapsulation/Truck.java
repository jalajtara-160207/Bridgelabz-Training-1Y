package com.Encapsulation;

public class Truck
{
    class truck extends VehicleRent implements Insurable.Insuarble
    {
        private String insurancePolicyNumber;

        public truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber)
        {
            super(vehicleNumber, "Truck", rentalRate);
            this.insurancePolicyNumber = insurancePolicyNumber;
        }

        @Override
        public double calculateRentalCost(int Days)
        {
            return getRentalRate() * Days;
        }

        @Override
        public double calculateInsurance()
        {
            return 4000;
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

}
