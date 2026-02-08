import java.util.Scanner;
class Array_5
{
	public static void main(String args[])
	{
		Scanner pro = new Scanner(System.in);
		System.out.println("Enter Your Number:");
		int a = pro.nextInt();
			for(int i=1;i<=10;i++)
			{
				System.out.println(a+"*"+i+"="+a*i);
			}
	}
}