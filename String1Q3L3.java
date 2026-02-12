package com.gla.string;

public class StringQ3L3 {
    public static void main(String args[])
    {
        String a = "Jalaj";
        boolean found = false;
        System.out.println("Input String : "+a);
        for(int i=0;i<a.length();i++)
        {
            char c = a.charAt(i);
            if(a.indexOf(c)==a.lastIndexOf(c))
            {
                System.out.println("The First non-repeating Character is: "+c);
                found = true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("There are no non-repeating Characters.");
        }

    }
}
