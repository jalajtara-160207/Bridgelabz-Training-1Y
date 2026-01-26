import java.util.Scanner;
class quo
{
	public static void main(String args[])
	{
		Scanner q = new Scanner(System.in);
		System.out.println("Enter The First Number:");
		int a = q.nextInt();
		System.out.println("Enter The Second Number:");
		int b = q.nextInt();
		int c = (a)/(b);
		int d = (a)%(b);
		System.out.println("The Quotient is:"+c);
		System.out.println("The Remainder is:"+d);
	}
}