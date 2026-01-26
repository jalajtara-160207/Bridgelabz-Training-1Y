import java.util.Scanner;
class IntOperation
{
	public static void main(String args[])
	{
		Scanner io = new Scanner(System.in);
		System.out.println("Enter The First Number:-");
		int a = io.nextInt();
		System.out.println("Enter The Second Number:-");
		int b = io.nextInt();
		System.out.println("Enter The Third Number:-");
		int c = io.nextInt();
		int e = (a+b)*c;
		int f = (a*b)+c;
		int g = (c+a)/b;
		int h = (a%b)+c;
		System.out.println("The Result of First Operation:-"+e);
		System.out.println("The Result of Second Operation:-"+f);
		System.out.println("The Result of Third Operation:-"+g);
		System.out.println("The Result of Fourth Operation:-"+h);
	}
}
		