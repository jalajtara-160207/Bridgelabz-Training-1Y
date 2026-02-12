package com.gla.string;
import java.util.Scanner;
public class StringQ7L2 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string with leading/trailing spaces:");
        String input = scanner.nextLine();

        int start = 0;
        int end = input.length() - 1;


        while (start <= end && input.charAt(start) == ' ') {
            start++;
        }


        while (end >= start && input.charAt(end) == ' ') {
            end--;
        }


        String trimmedResult = "";
        for (int i = start; i <= end; i++) {
            trimmedResult += input.charAt(i);
        }

        System.out.println("Original: [" + input + "]");
        System.out.println("Trimmed:  [" + trimmedResult + "]");
        System.out.println("Length reduced from " + input.length() + " to " + trimmedResult.length());
    }
    }
