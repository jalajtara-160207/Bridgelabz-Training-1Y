import java.util.Scanner;
class Harry
{
	public static void main(String args[])
	{
		Scanner age = new Scanner(System.in);
		System.out.println("Enter the birth year:");
		int a = age.nextInt();
		System.out.println("Enter The Current year:");
		int b = age.nextInt();
		int A = b-a;
		System.out.println("The age of the Person is : "+A);
	}
}