import java.util.Scanner;
class Table
{
	public static void main(String args[])
	{
		Scanner t = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int number = t.nextInt();
		for(int i=1;i<=10;i++)
		{
			if(number<=6 && number>=9)
			{
				System.out.println("The Table is:");
				System.out.println(number+"*"+i+"="+number*i);
			}
		}
	}
}