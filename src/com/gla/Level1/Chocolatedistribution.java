package com.gla.Level1;
import java.util.Scanner;
public class Chocolatedistribution {
    public static int chocolatesPerChild(int chocolates, int children) {
        return chocolates / children;
    }
    public static int remainingChocolates(int chocolates, int children) {
        return chocolates % children;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of chocolates (N): ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children (M): ");
        int children = sc.nextInt();
        int perChild = chocolatesPerChild(chocolates, children);
        int remaining = remainingChocolates(chocolates, children);
        System.out.println("Each child will get " + perChild + " chocolates.");
        System.out.println("Remaining chocolates = " + remaining);
    }

    }
