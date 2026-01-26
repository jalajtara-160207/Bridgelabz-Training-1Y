import java.util.Scanner;
class Even
{
	public static void main(String args[])
	{
		Scanner even = new Scanner(System.in);
		System.out.println("Enter The Number:-");
		int a = even.nextInt();
		if(a%2==0)
		{
			System.out.println("The Given Number is Even.");
		}
		else
		{
			System.out.println("The Given Number is Odd.");
		}
	}
}