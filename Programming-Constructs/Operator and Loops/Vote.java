import java.util.Scanner;
class Vote
{
	public static void main(String args[])
	{
		Scanner v = new Scanner(System.in);
		System.out.println("Enter Your Age:-");
		int a = v.nextInt();
		if(a>=18)
		{
			System.out.println("You Are Eligible to Vote.");
		}
		else
		{
			System.out.println("You Are Not Eligible to Vote.");
        }
    }
}	