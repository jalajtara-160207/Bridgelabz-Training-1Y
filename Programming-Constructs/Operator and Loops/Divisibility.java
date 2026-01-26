import java.util.Scanner;
class Divisibility
{
	public static void main(String args[])
	{
		Scanner div = new Scanner(System.in);
		System.out.println("Enter The Number:-");
		int a = div.nextInt();
		if(a%5==0)
		{
			System.out.println("Number Divisible by 5.");
		}
		else
		{
			System.out.println("Number Not Divisible by 5.");
		}
	}
}