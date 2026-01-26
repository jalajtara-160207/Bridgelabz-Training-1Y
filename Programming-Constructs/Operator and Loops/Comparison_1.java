import java.util.Scanner;
class Comparison
{
	public static void main(String args[])
	{
		Scanner comp = new Scanner(System.in);
		System.out.println("Enter The First Number:-");
		int a = comp.nextInt();
		System.out.println("Enter The Second Number:-");
		int b = comp.nextInt();
		System.out.println("Enter The Third Number:-");
		int c = comp.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("The Greatest number is:-"+a);
		}
		else if(b>a&&b>c)
		{
			System.out.println("The Greatest Number is:-"+b);
		}
		else
		{
			System.out.println("The Greatest Number is:-"+c);
		}
	}
}