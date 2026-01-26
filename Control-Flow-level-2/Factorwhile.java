import java.util.Scanner;
class Factor
{
	public static void main(String args[])
	{
		Scanner f = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a = f.nextInt();
		int i=1;
		while(i<=a)
		{
			if(a%i==0)
			{
				System.out.println(i+" ");
			}
		}
	}
}