import java.util.Scanner;
class Profit
{
	public static void main(String args[])
	{
		Scanner pro = new Scanner(System.in);
		System.out.println("Enter the profit:");
		int profit = pro.nextInt();
		System.out.println("Enter the loss:");
		int loss = pro.nextInt();
		System.out.println("Enter the Selling Price:");
		int sp = pro.nextInt();
		System.out.println("Enter the cost Price:");
		int cp = pro.nextInt();
		int p = sp-cp;
		int P = p/(cp*100);
		System.out.println("The cost price is INR +cp"+cp);
		System.out.println("The Selling Price is INR +sp"+sp);
		System.out.println("The Profit is:"+p);
		System.out.println("The Profit Percentage is:"+P);
	}
}