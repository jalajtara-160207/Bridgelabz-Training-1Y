import java.util.Scanner;
class uni
{
	public static void main(String args[])
	{
		Scanner stu = new Scanner(System.in);
		System.out.println("Enter the fee:");
		int f = stu.nextInt();
		System.out.println("Enter the Discount Percent:");
		int dp =  stu.nextInt();
		System.out.println("The fee to pay after discount:");
		int FA = stu.nextInt();
		System.out.println("The Discount amount in INR is:"+D);
		int D = (f)/(dp)*100;
		System.out.println("Final Discounted Fee in INR is:"+FA);
	}
}