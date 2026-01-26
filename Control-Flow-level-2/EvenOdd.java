import java.util.Scanner;
class Event
{
	public static void main(String args[])
	{
		Scanner even = new Scanner(System.in);
		System.out.println("Enter The Integer:-");
		int I = even.nextInt();
		for(int i=1;i<=I;i++)
		{
			if(I%2==0)
			{
				System.out.println("The Number is Even.");
			}
			else 
			{
				System.out.println("The Number is Odd.");
			}
		}
	}
}