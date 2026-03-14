package com.gla.Level2;
import java.util.Scanner;
public class Youngest {
        public static String findYoungest(String[] names, int[] ages) {
            int minAge = ages[0];
            int index = 0;
            for (int i = 1; i < ages.length; i++) {
                if (ages[i] < minAge) {
                    minAge = ages[i];
                    index = i;
                }
            }
            return names[index] + " is the youngest (Age: " + minAge + ")";
        }
        public static String findTallest(String[] names, double[] heights) {
            double maxHeight = heights[0];
            int index = 0;
            for (int i = 1; i < heights.length; i++) {
                if (heights[i] > maxHeight) {
                    maxHeight = heights[i];
                    index = i;
                }
            }
            return names[index] + " is the tallest (Height: " + maxHeight + " cm)";
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] names = {"Amar", "Akbar", "Anthony"};
            int[] ages = new int[3];
            double[] heights = new double[3];
            System.out.println("Enter ages of Amar, Akbar, and Anthony:");
            for (int i = 0; i < names.length; i++) {
                System.out.print(names[i] + "'s age: ");
                ages[i] = sc.nextInt();
            }
            System.out.println("\nEnter heights (in cm) of Amar, Akbar, and Anthony:");
            for (int i = 0; i < names.length; i++) {
                System.out.print(names[i] + "'s height: ");
                heights[i] = sc.nextDouble();
            }
            System.out.println("\nResults:");
            System.out.println(findYoungest(names, ages));
            System.out.println(findTallest(names, heights));
        }

}
