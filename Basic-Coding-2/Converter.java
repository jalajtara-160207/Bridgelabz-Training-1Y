import java.util.Scanner;
class Converter
{
	public static void main(String args[])
	{
		Scanner convert = new Scanner(System.in);
		System.out.println("Enter the Distance in K.M.:");
		int km = convert.nextInt();
		System.out.println("Enter the Distance in Miles:");
		int mile = convert.nextInt();
		double M = (km)*1.6;
		System.out.println("The Converted value of Distance is:"+M);
	}
}