import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner p = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int a = p.nextInt();
		int temp=a;
		int rev=0;
		int rem=0;
		while(temp!=0)
		{
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(a==rev)
		{
			System.out.println("The Given Number is Palindrome.");
		}
		else
		{
			System.out.println("The Given Number is not Palindrome.");
		}
	}
}