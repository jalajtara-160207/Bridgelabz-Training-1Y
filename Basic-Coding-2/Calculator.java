import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{
		Scanner calc = new Scanner(System.in);
		System.out.println("Enter The First Number:");
		int a = calc.nextInt();
		System.out.println("Enter The Second Number:");
		int b = calc.nextInt();
		int c = a+b;
		double d = a-b;
		int e = a*b;
		double f = a/b;
		System.out.println("The Addition of two numbers is:"+c);
		System.out.println("The Substraction of two numbers is:"+d);
		System.out.println("The Product of two numbers is:"+e);
		System.out.println("The Division of two numbers is:"+f);
	}
}