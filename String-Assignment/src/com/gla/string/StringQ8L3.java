package com.gla.string;
import java.util.Arrays;
import java.util.Scanner;
public class StringQ8L3 {
    public static void main(String  args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Text: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the Second Text: ");
        String str2 = sc.nextLine();
        if (isAnagram(str1, str2)) {
            System.out.println("Result: The Texts are anagrams!");
        } else {
            System.out.println("Result: The Texts are not anagrams.");
        }
    }
    public static boolean isAnagram(String s1,String s2)
    {
        s1 = s1.replaceAll("\\s"," ").toLowerCase();
        s2 = s2.replaceAll("\\s"," ").toLowerCase();
        if(s1.length()!=s2.length())
        {
            return false;
        }
        char[]  charArray1 = s1.toCharArray();
        char[]  charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);

    }
}
