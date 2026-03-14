package com.gla.Level2;
import java.util.Scanner;
public class Number
{
        public static String checkSign(int num) {
            if (num >= 0) {
                return "Positive";
            } else {
                return "Negative";
            }
        }
        public static String checkEvenOdd(int num) {
            if (num % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        }
        public static String compareFirstLast(int[] arr) {
            if (arr[0] == arr[arr.length - 1]) {
                return "First and last elements are equal.";
            } else if (arr[0] > arr[arr.length - 1]) {
                return "First element is greater than the last element.";
            } else {
                return "First element is less than the last element.";
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] numbers = new int[5];
            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
            }
            System.out.println("\nAnalysis of numbers:");
            for (int i = 0; i < numbers.length; i++) {
                String sign = checkSign(numbers[i]);
                System.out.print("Number " + (i + 1) + " (" + numbers[i] + "): " + sign);
                if (sign.equals("Positive")) {
                    System.out.print(", " + checkEvenOdd(numbers[i]));
                }
                System.out.println();
            }
            System.out.println("\nComparison of first and last elements:");
            System.out.println(compareFirstLast(numbers));
        }
    }

