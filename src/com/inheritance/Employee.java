package com.inheritance;

public class Employee {
    String Name;
    int ID;
    double Salary;

    public Employee(String Name, int ID, double Salary)
    {
        this.Name = Name;
        this.ID = ID;
        this.Salary = Salary;
    }
    public void DisplayInfo()
    {
        System.out.println("Enter The Name of The Employee:-"+Name);
        System.out.println("Enter The ID of The Employee:-"+ID);
        System.out.println("Enter The Salary of The Employee:-"+Salary);
    }
}
class Manager extends Employee
{
    int TeamSize;

    public Manager(String Name, int ID, double Salary, int TeamSize)
    {
        super(Name, ID, Salary);
        this.TeamSize = TeamSize;
    }
    @Override
    public void DisplayInfo()
    {
        super.DisplayInfo();
        System.out.println("Enter The Team Size:- "+ TeamSize);
    }
}
class Developer extends Employee
{
    String ProgrammingLang;

    public Developer(String Name, int ID, double Salary, String ProgrammingLang)
    {
        super(Name, ID, Salary);
        this.ProgrammingLang = ProgrammingLang;
    }
    @Override
    public void DisplayInfo()
    {
        super.DisplayInfo();
        System.out.println("Enter The Programming Language of The Developer:-"+ProgrammingLang);
    }
}
class Intern extends Employee
{
    String University;

    public Intern(String Name, int ID, double Salary, String University)
    {
        super(Name, ID, Salary);
        this.University = University;
    }
    @Override
    public void DisplayInfo()
    {
        super.DisplayInfo();
        System.out.println("Enter The University of The Intern Under Training:-"+University);
    }
}
