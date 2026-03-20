package com.inheritance;

import javax.naming.Name;

public class Teacher {
    String tName;
    String subject;
    int id;
    double salary;

    public Teacher(String tName, String subject, int id, double salary) {
        this.tName = tName;
        this.subject = subject;
        this.id = id;
        this.salary = salary;
    }
    public void teacherinfo()
    {
        System.out.println("Name of Teacher:-"+ tName);
        System.out.println("Subject:-"+ tName);
        System.out.println("ID:-"+id);
        System.out.println("Salary:-"+salary);
    }
    public void result(int Score)
    {
        if(Score>=90)
        {
            System.out.println(Score+"O");
        }
        else if(Score < 90 && Score>=80)
        {
            System.out.println(Score+"A");
        }
    }
}
