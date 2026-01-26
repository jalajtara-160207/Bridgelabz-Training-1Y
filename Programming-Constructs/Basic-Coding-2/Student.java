import java.util.Scanner;
class Student
{
	public static void main(String args[])
	{
		Scanner stud = new Scanner(System.in);
		System.out.println("Enter the number of Pens");
		int p = stud.nextInt();
		System.out.println("Enter the number of Stduents");
		int s = stud.nextInt();
		int d = p%s;
		double e = p/s;
		System.out.println("Enter the Distributed pens"+d);
		System.out.println("Enter the number of pens each student got:"+e);
	}
}