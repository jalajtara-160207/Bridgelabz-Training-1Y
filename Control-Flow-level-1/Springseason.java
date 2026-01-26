import java.util.Scanner;
class Spring
{
	public static void main(String args[])
	{
		Scanner spring = new Scanner(System.in);
		System.out.println("Enter the Month:-");
		int m = spring.nextInt();
		System.out.println("Enter The Day:-");
		int d = spring.nextInt();
		if(m==3)
		{
			if(d >=20 && d<=31)
			{
				System.out.println("It's a Spring Season.");
			}
		}
		else if(m>=4 && m<= 5)
		{
			System.out.println("It's a Spring Season.");
		}
		else if(m==6)
		{
			if(d>=20 && d<=20)
			{
				System.out.println("It's a Spring Season.");
			}
		}
	}
}