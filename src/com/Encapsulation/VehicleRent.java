package com.Encapsulation;

public abstract class VehicleRent
{
    String VehicleNumber;
    String Type;
    double RentalRate;

    public VehicleRent(String vehicleNumber, String type, double rentalRate)
    {
        this.VehicleNumber = vehicleNumber;
        this.Type = type;
        this.RentalRate = rentalRate;
    }

    public VehicleRent() {

    }

    public String getVehicleNumber()
    {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber)
    {
        this.VehicleNumber = vehicleNumber;
    }

    public String getType()
    {
        return Type;
    }

    public void setType(String type)
    {
        this.Type = type;
    }

    public double getRentalRate()
    {
        return RentalRate;
    }

    public void setRentalRate(double rentalRate)
    {
        this.RentalRate = rentalRate;
    }
    public abstract double calculateRentalCost(int days);

    public void DisplayDetails(int Days)
    {
        System.out.println("Enter The Vehicle Number:- "+VehicleNumber);
        System.out.println("Enter The Type of Vehicle:- "+Type);
        System.out.println("Enter The Rental Rate Per Day:- "+RentalRate);
        System.out.println("Rental Cost For"+"Days: "+calculateRentalCost(Days));
    }

    public abstract double calculateInsurance();

    public abstract String getInsuranceDetails();

    public abstract void displayDetails(int Days);
}
