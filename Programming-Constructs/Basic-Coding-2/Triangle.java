import java.util.Scanner;
class tri
{
	public static void main(String args[])
	{
		Scanner t = new Scanner(System.in);
		System.out.println("Enter The Base of Triangle:-");
		int b = t.nextInt();
		System.out.println("Enter The Height of Triangle:-");
		int h = t.nextInt();
		double area = (b*h)*1/2;
		System.out.println("The area of Triangle is:-"+area);
	}
}