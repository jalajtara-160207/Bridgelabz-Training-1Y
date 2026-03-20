package com.inheritance;

public class Student extends Teacher{
    String sName;
    int Roll_Number;
    String Course;

    public Student(String tName, String subject, int id, double salary, String sName, int roll_Number, String course) {
        super(tName, subject, id, salary);
        this.sName = sName;
        Roll_Number = roll_Number;
        Course = course;
    }

    public void Studentinfo()
    {
        super.result(95);
        super.teacherinfo();
        System.out.println("Name of Student:-"+sName);
        System.out.println("Roll Number of Student:-"+Roll_Number);
        System.out.println("Course:-"+Course);
    }
}
