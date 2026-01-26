import java.util.Scanner;
class Unary
{
	public static void main(String args[])
	{
		Scanner unary = new Scanner(System.in);
		System.out.println("Enter The Number:-");
		int a = unary.nextInt();
		System.out.println(a++);
		System.out.println(++a);
	}
}
		