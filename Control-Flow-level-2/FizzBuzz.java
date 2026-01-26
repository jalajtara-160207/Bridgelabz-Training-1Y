import java.util.Scanner;
class FizzBuzz
{
	public static void main(String args[])
	{
		Scanner fb = new Scanner(System.in);
		System.out.println("Enter the Number:=");
		int a = fb.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(i%3==0)
			{
				System.out.println("Fizz");
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			else if(i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz");
			}
		}
	}
}