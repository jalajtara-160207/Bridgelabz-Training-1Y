package com.gla.Level2;
import java.util.Scanner;
public class Vote {
    public static boolean canVote(int age) {
        return age >= 18;
    }

    public static void displayEligibility(int[] ages) {
        for (int i = 0; i < ages.length; i++) {
            if (canVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") is NOT eligible to vote.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        System.out.println("\nVoting Eligibility Results:");
        displayEligibility(ages);

    }
}

