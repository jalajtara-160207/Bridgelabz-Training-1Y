import java.util.Scanner;
class Sumnum
{
	public static void main(String args[])
	{
		Scanner sum = new Scanner(System.in);
		System.out.println("Enter The Variable:-");
		double A = sum.nextDouble();
		double total=0.0;
		while(A != 0)
		{
		total+=A;
		System.out.println("The Total Value is. :"+A);
		double a = sum.nextDouble();}
	}
}