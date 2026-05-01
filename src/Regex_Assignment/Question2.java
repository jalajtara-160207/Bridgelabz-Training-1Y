package Regex_Assignment;
import java.util.Scanner;
public class Question2
{
        public static boolean isValidPlate(String plate) {
            // Regex:
            // ^        -> start
            // [A-Z]{2} -> exactly 2 uppercase letters
            // [0-9]{4} -> exactly 4 digits
            // $        -> end
            String regex = "^[A-Z]{2}[0-9]{4}$";

            return plate.matches(regex);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter license plate: ");
            String plate = scanner.nextLine();

            if (isValidPlate(plate))
            {
                System.out.println("The Entered PLate is a Valid License Plate ");
            }
            else
            {
                System.out.println("The Entered Plate is an Invalid License Plate ");
            }
            scanner.close();
        }
    }
