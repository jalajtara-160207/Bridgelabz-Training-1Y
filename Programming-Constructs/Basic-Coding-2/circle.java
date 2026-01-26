import java.util.Scanner;
class Area
{
	public static void main(String args[])
	{
		Scanner jt = new Scanner(System.in);
		System.out.println("Enter the radius");
		int r = jt.nextInt();
		double pi = 22/7;
		double a= pi*r*r;
		System.out.println("Area of Circle: "+a);
	}
}