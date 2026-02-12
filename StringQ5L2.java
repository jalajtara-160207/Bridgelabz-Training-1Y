package com.gla.string;
import java.util.Scanner;
public class StringQ5L2 {
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr A String: ");
        String input = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        String str = input.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowels++;
            }
            else
            {
                consonants++;
            }
        }
        System.out.println("---------------------------");
        System.out.println("Vowels count: "+vowels);
        System.out.println("Consonants count: "+consonants);
    }
}
