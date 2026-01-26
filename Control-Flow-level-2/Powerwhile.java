import java.util.Scanner;
class Power
{
	public static void main(String args[])
	{
		Scanner p = new Scanner(System.in);
		System.out.println("Enter the Base:");
		int b = p.nextInt();
		System.out.println("Enter the Exponent:");
		int e = p.nextInt();
		int res = 1;
		int i = 1;
		while(i<=e)
		{
			res *= b;
			i++;
		}
		System.out.println(b +"^" + e + "=" + res);
	}
}