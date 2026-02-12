package com.gla.string;

public class StringQ2L3 {
    public static void main(String args[]) {
        String a = "Programming";
        System.out.println("Original String: " + a);
        System.out.println("Unique Characters: ");
        for (int i = 0; i < a.length(); i++)
        {
            char currentChar = a.charAt(i);

            if(a.indexOf(currentChar)==a.lastIndexOf(currentChar))
            {
                System.out.println(currentChar + " ");
            }
        }
    }
}
