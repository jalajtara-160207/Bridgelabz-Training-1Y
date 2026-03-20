package com.Abstraction;

public class Password {
    public static boolean isStrongPassword(String pwd)
    {
        return false;
    }

    interface Security
    {
        static boolean isStrongPassword(String Password)
        {
            if(Password == null)
            {
                return false;
            }

            if(Password.length() < 8 )
            {
                return false;
            }

            if(!Password.matches(".*[A-Z].*"))
            {
                return false;
            }
            if(!Password.matches(".*[a-z].*"))
            {
                return false;
            }
            if(!Password.matches(".*\\d.*"))
            {
                return false;
            }
            if(!Password.matches(".*[!@#$%^&*(),.?\":{}|<>].*"))
            {
                return false;
            }
            return true;
        }
    }
}
