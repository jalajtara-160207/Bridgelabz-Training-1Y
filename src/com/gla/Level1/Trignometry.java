package com.gla.Level1;
import java.util.Scanner;
public class Trignometry {
    public static void calculateTrigFunctions(double angleDegrees) {
        double angleRadians = Math.toRadians(angleDegrees);
        double sine = Math.sin(angleRadians);
        double cosine = Math.cos(angleRadians);
        double tangent = Math.tan(angleRadians);
        double cotangent = 1.0 / tangent;
        double secant = 1.0 / cosine;
        double cosecant = 1.0 / sine;
        System.out.println("Angle: " + angleDegrees + "°");
        System.out.println("Sine = " + sine);
        System.out.println("Cosine = " + cosine);
        System.out.println("Tangent = " + tangent);
        System.out.println("Cotangent = " + cotangent);
        System.out.println("Secant = " + secant);
        System.out.println("Cosecant = " + cosecant);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        calculateTrigFunctions(angle);

    }
    }
