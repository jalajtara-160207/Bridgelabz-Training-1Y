import java.util.Scanner;
class Array_3
{
	public static void main(String args[])
	{
		Scanner digit = new Scanner(System.in);
		System.out.println("Enter a number.");
		int num = digit.nextInt();
		int largest = -1;
		int second_largest = -1;
		while(num>0)
		{
			int digit = num % 10;
			num /= 10;
			if (digit>largest)
			{
				second_largest = largest;
				largest = digit;
				
			}
			else if(digit>second_largest && digit!=largest)
			{
				second_largest=digit;
			}	
		}
		System.out.println(Largest Digit:"+largest);
		System.out.println(Second largest Digit:"+second_largest);
	}
}