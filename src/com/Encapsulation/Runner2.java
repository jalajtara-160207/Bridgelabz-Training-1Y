package com.Encapsulation;
import java.util.ArrayList;
public class Runner2
{
    static void main()
    {
        ArrayList<VehicleRent> vehicles = new ArrayList<>();

        Insurable.Car car = new Insurable.Car("C101", 1500, "CAR-INS-001");
        Insurable.Car bus = new Insurable.Bus("B102", 2000, "CAR-ISN-002");
        Insurable.Car truck = new Insurable.Truck("T103", 2500, "CAR-IAI-008");

        vehicles.add(car);
        vehicles.add(bus);
        vehicles.add(truck);

        int rentalDays = 5;


        for (VehicleRent v : vehicles)
        {
            System.out.println("---------------");
            v.DisplayDetails(rentalDays);
        }
    }
}
