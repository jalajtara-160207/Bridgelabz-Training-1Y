import java.util.Scanner;
class Sam
{
	public static void main(String args[])
	{
		Scanner sam = new Scanner(System.in);
		System.out.println("Enter The marks in Mathematics:");
		int a = sam.nextInt();
		System.out.println("Enter The marks in Physics:");
		int b = sam.nextInt();
		System.out.println("Enter The marks in Chemistry:");
		int c = sam.nextInt();
		int avg = (a+b+c)/3;
		System.out.println("The Average of the Marks is:"+avg);
	}
}