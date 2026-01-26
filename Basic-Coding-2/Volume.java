import java.util.Scanner;
class Volume
{
	public static void main(String args[])
	{
		Scanner vol = new Scanner(System.in);
		System.out.println("Enter The Volume in km:");
		int km = vol.nextInt();
		System.out.println("Enter The Radius of Earth:");
		int r = vol.nextInt(); 
		int pi = 22/7;
		double V = (4/3)*pi*r*r*r;
		double mile = (0.621)*km;
		double Km = V;
		System.out.println("The Volume of Earth in kilometers is:"+Km);
		System.out.println("The Volume of Earth in cubic miles is:"+mile);
	}
}