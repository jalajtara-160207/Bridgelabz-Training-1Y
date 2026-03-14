package com.gla.Level1;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayResults() {
        System.out.printf("Radius: %.2f\n", radius);
        System.out.printf("Area: %.2f\n", calculateArea());
        System.out.printf("Circumference: %.2f\n", calculateCircumference());
    }
}

