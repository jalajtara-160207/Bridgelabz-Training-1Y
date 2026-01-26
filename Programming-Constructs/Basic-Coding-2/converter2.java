import java.util.Scanner;
class Converter
{
	public static void main(String args[])
	{
		Scanner con = new Scanner(System.in);
		System.out.println("Enter the Distance in km:");
		int km = con.nextInt();
		System.out.println("Enter the Distance in miles:");
		int mile = con.nextInt();
		double km = mile*(1.6);
        System.out.println("The Converted Distance in Miles is"+mile);
	}
}	