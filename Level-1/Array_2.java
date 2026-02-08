import java.util.Scanner;
class Array_2
{
	public static void main(String args[])
	{
		int arr[5];
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the elements of Array.");
		int num = a.nextInt();
		if(num>=0)
		{
			System.out.println("The Given Number is Positive.");
		}
	    else if(num%2==0)
		{
			System.out.println("The Given number is Also Even.");
		}
		else if(num<=0)
		{
			System.out.println("The Given number id Negative.");
		}
		else
		{
			System.out.println("The Given number is Zero.");
		}
    }
}

			