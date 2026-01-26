import java.util.Scanner;
class Calculator1
{
	public static void main(String args[])
	{
		Scanner calc = new Scanner(System.in);
		System.out.println("Enter the First Number:-");
		int a = calc.nextInt();
		System.out.println("Enter the Second Number:-");
		int b = calc.nextInt();
		int c = a+b;
		int d = a-b;
		int e = a*b;
		int f = (a)/(b);
        System.out.println("The Sum of Two Numbers is:"+c);
		System.out.println("The Difference of Two Numbers is:"+d);
		System.out.println("The Product of Numbers is:"+e);
        System.out.println("The Division of Numbers is:"+f);
        
		