package com.gla;
//Program to Display Employee Details
//Problem Statement: Write a program to create an Employee class with attributes
//name, id, and salary. Add a method to display the details.
public class Employee1 {
    public void details()
    {
        String name="Jalaj";
        int id=102;
        int salary=1500;
        System.out.println("Employee Name:- "+name);
        System.out.println("Employee id:- "+id);
        System.out.println("Employee salary:-"+salary);

    }

    static void main() {
        Employee1 e1 = new Employee1();
        e1.details();
    }
}
