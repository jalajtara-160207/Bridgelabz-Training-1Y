import java.util.Scanner;
class Array_3
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter your Number.");
		int num = a.nextInt();
		int arr[];
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+ i + "=" +num*i);
		}
	}
}