package com.gla.Level1Practice;

public class Grade {
    private String name;
    private int rollNumber;
    private double marks;

    public Grade(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "D";
    }

    public void displayReport() {
        System.out.println("Student: " + name + " (Roll: " + rollNumber + ")");
        System.out.println("Marks: " + marks + " | Grade: " + calculateGrade());
    }
}

