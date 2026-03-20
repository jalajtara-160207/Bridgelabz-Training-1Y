package com.Abstraction;

public class Runner3
{
    static void main()
    {
        String[] testPasswords =
        {
                        "Pass123!",
                        "WeakPass",
                        "Insurance@2026",
                        "Short1!"
        };
        for (String pwd : testPasswords) {
            boolean strong = Password.isStrongPassword(pwd);
            System.out.println("Password: " + pwd + " | Strong? " + strong);
        }

    }
}
