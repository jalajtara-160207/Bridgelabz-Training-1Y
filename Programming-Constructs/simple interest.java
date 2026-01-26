import java.util.Scanner;
class Simple_Interest
{
	public static void main(String args[])
	{
		Scanner si = new Scanner(System.in);
		System.out.println("Enter The Principle Amount:");
		int p = si.nextInt();
		System.out.println("Enter The Rate Amount:");
		int r = si.nextInt();
		System.out.println("Enter The Time Period:");
		int t = si.nextInt();
		int si = p*r*t/100;
		System.out.println("The Interest is:"+si);
	}
}