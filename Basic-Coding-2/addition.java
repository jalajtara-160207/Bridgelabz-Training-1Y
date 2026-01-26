import java.util.Scanner;
class addition
{
	public static void main(String args[])	
	{
		Scanner add = new Scanner(System.in);
		System.out.println("Enter First Number:-");
		int first = add.nextInt();
		System.out.println("Enter Second Number:-");
		int second = add.nextInt();
		int sum = first + second;
		System.out.println("The Addition of two number is"+sum);
	}
}