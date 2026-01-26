import java.util.Scanner;
class Perimeter
{
	public static void main(String args[])
	{
		Scanner peri = new Scanner(System.in);
	    System.out.println("Enter the Side of Square:-");
		int s = peri.nextInt();
		double P = (4)*s;
		System.out.println("The Perimeter of the Square is:"+P);
	}
}