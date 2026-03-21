package com.Encapsulation;

public abstract class EmployeeManagement
{
    int EmployeeID;
    String Name;
    double BaseSalary;

    public EmployeeManagement(int employeeID, String name, double baseSalary)
    {
        this.EmployeeID = employeeID;
        this.Name = name;
        this.BaseSalary = baseSalary;
    }
    public int getEmployeeID()
    {
        return EmployeeID;
    }
    public void setEmployeeID(int employeeID)
    {
        this.EmployeeID = employeeID;
    }
    public String getName()
    {
        return Name;
    }
    public void setName(String name)
    {
        this.Name = name;
    }
    public double getBaseSalary()
    {
        return BaseSalary;
    }
    public void setBaseSalary(double baseSalary)
    {
        this.BaseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void DisplayDetails()
    {
        System.out.println("Enter The Employee ID:- "+EmployeeID);
        System.out.println("Enter The Employee Name:- "+Name);
        System.out.println("Enter The Base Salary of The Employee:- "+BaseSalary);
        System.out.println("Enter The Calculated Salary of The Employee:- "+calculateSalary());
    }
}

interface Department
{
    void AssignDepartment(String DepartmentName);
    String getDepartmentDetails();
}
class FullTimeEmployee extends EmployeeManagement implements Department
{
    String DepartmentName;

    public FullTimeEmployee(int EmployeeID, String Name, double BaseSalary, int i)
    {
        super(EmployeeID,Name,BaseSalary);
    }
    @Override
    public double calculateSalary()
    {
        return getBaseSalary() + 5000;
    }
    @Override
    public void AssignDepartment(String DepartmentName)
    {
        this.DepartmentName = DepartmentName;
    }
    @Override
    public String getDepartmentDetails()
    {
        return "Department: "+DepartmentName;
    }
    @Override
    public void DisplayDetails()
    {
        super.DisplayDetails();
        System.out.println(getDepartmentDetails());
    }
}
