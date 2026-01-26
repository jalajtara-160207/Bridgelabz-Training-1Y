import java.util.Scanner;
class Bonus
{
	public static void main(String args[])
	{
		Scanner b = new Scanner(System.in);
		System.out.println("Enter the Salary:");
		int s = b.nextInt();
		System.out.println("Enter the Year of Service:");
		int y = b.nextInt();
		if(y>5)
		{
			s = s*5;
			System.out.println("Congratulations!! you are getting 5% Bonus!! Enjoy");
			s = s*5;
		}
		else
		{
			System.out.println("Not Eligible for Bonus.");
		}
	}
}	