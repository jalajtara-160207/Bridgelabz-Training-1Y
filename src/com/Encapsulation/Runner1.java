package com.Encapsulation;
import java.util.ArrayList;
public class Runner1
{
    static void main()
    {
        ArrayList<FullTimeEmployee> employees = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee(710, "Jalaj", 20000, 40);
        fte.AssignDepartment("HR");

        FullTimeEmployee pte = new FullTimeEmployee(800, "Riya", 50000, 40);
        pte.AssignDepartment("IT");

        employees.add(fte);
        employees.add(pte);

        // Polymorphism: processing employees via Employee reference
        for (FullTimeEmployee emp : employees) {
            System.out.println("---------------");
            emp.DisplayDetails();
        }
    }
}
