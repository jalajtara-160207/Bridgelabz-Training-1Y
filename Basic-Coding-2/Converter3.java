import java.util.Scanner;
class Converter
{
	public static void main(String args[])
	{
		Scanner con = new Scanner(System.in);
		System.out.println("Enter the Height in Centimeters:");
		int cm = con.nextInt();
		double feet = (30.48)*cm;
		double inches = (2.54)*cm;
		System.out.println("The Converted Height in Feet is"+feet);
		System.out.println("The Converted Height in Inches is"+inches);
	}
}