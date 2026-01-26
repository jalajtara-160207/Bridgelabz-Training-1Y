import java.util.Scanner;
class Countfor
{
	public static void main(String args[])
	{
		Scanner count = new Scanner(System.in);
		System.out.println("Enter the Variable:-");
		int a = count.nextInt();
		for(int i=1;a>=i;a--)
		{
			System.out.println(a);
		}
		System.out.println("Rocket Launch:))");
	}
}
		