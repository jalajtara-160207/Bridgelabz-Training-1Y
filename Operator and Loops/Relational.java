import java.util.Scanner;
class Relational
{
	public static void main(String args[])
	{
		Scanner relate = new Scanner(System.in);
		System.out.println("Enter The Age:-");
		int a = relate.nextInt();
		if(a>18)
		{
			System.out.println("Allowed");
		}
		else
		{
			System.out.println("Not Allowed");
		}
	}
}