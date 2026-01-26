import java.util.Scanner;
class Positive
{
	public static void main(String args[])
	{
		Scanner pos = new Scanner(System.in);
		System.out.println("Enter The First number:-");
		int a = pos.nextInt();
		if(a>0)
		{
			System.out.println("The Given Number is Positive.");
		}
		else
		{
			System.out.println("The Given Number is Negative.");
		}
	}
}