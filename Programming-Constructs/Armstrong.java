import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Number:-");
		int b = a.nextInt();
		int res = 0;
		int og_num = b;
		while(b!=0)
		{
			int digit = b%10;
			res += digit*digit*digit;
			b /= 10;
		}
        if(res == og_num)
		{
			System.out.println("The given number is Armstrong.");
		}
		else
		{
			System.out.println("The given number is not Armstrong.");
		}
	}
}