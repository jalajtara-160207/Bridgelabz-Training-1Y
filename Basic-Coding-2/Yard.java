import java.util.Scanner;
class Yard
{
	public static void main(String args[])
	{
		Scanner y = new Scanner(System.in);
		System.out.println("Enter The Distance in Feets:-");
		int f = y.nextInt();
		int yards = f*(3);
		System.out.println("The Distance in Miles is:-");
		int m = y.nextInt();
		int miles = f*(5280);
		System.out.println("The Distance in yards is:"+yards);
		System.out.println("The Distance in Miles is:"+miles);
	}
}