package com.Encapsulation;

public class Partime {

    static class PartTimeEmployee extends EmployeeManagement implements Department
    {
        String DepartmentName;
        int workHours;

        public PartTimeEmployee(int EmployeeID,String Name,double BaseSalary,int WorkHours)
        {
            super(EmployeeID,Name,BaseSalary);
            this.workHours = workHours;
        }
        @Override
        public double calculateSalary()
        {
            return getBaseSalary() * workHours;
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
            System.out.println("Work Hours: "+workHours);
            System.out.println(getDepartmentDetails());
        }
    }
}
