package Regex_Assignment;
import java.util.Scanner;
public class Question1
{
        public static boolean isValidUsername(String username)
        {
            // Regex explanation:
            // ^                 -> start of string
            // [a-zA-Z]          -> must start with a letter
            // [a-zA-Z0-9_]{4,14} -> remaining characters (total length 5–15)
            // $                 -> end of string
            String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

            return username.matches(regex);
        }
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            if (isValidUsername(username))
            {
                System.out.println("The Given Username is a Valid Username.");
            }
            else
            {
                System.out.println("The Given Username is an Invalid Username.");
            }
            scanner.close();
        }
    }
