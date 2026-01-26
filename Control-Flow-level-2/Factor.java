import java.util.Scanner;
class Factor
{
	public static void main(String args[])
	{
		Scanner f = new Scanner(System.in);
		System.out.println("Enter The Number");
		int a = f.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(a % i==0)
			{
				System.out.println(i +" ");
			}
		}
	}
}