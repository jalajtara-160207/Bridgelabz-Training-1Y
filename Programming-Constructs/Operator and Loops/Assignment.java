import java.util.Scanner;
class Assignment
{
		public static void main(String args[])
		{
			Scanner assign = new Scanner(System.in);
			System.out.println("Enter The Number:-");
			int a = assign.nextInt();
			a += 5;
			System.out.println(a);
			a -= 5;
			System.out.println(a);
			a *= 5;
			System.out.println(a);
		    a /= 5;
			System.out.println(a);
		}
}