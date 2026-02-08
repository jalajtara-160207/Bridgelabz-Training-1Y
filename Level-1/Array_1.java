import java.util.Scanner;
class Array_1
{
	public static void main(String args[])
	{
		int arr[10];
		Scanner age = new Scanner(System.in);
		System.out.println("Enter your Age.");
		int A = age.nextInt();
		if(A<0)
		{
			System.out.println("Invalid Age Entered.");
		}
		else if(A>=18)
		{
			System.out.println("Eligible to Vote.");
		}
		else
		{
			System.out.println("Student Can't Vote.");
		}
	}
}
