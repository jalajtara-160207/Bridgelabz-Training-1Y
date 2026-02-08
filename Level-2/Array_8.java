import java.util.Scanner;
class Array_7
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,40,50,60,70,80,90,100};
		int arr1[]={'A','B','C','D','E','R'};
		Scanner avg = new Scanner(System.in);
		System.out.println("Enter Marks:");
		int a = avg.nextInt();
		System.out.println("Enter Marks in Physics:");
		int phy = avg.nextInt();
		System.out.println("Enter Marks in Chemistry:");
		int chem = avg.nextInt();
		System.out.println("Enter Marks in Mathematics:");
		int maths =avg.nextInt();
		if(a>=80)
		{
			System.out.println("Level 4 with grade A");
		}
		else if(a>=70 && a<=79)
		{
			System.out.println("Level 3, with grade B.");
		}
		else if(a>=60 && a<=69)
		{
			System.out.println("Level 2,with grade C.");
		}
		else if(a>=50 && a<=59)
		{
			System.out.println("Level 1,with grade D.");
		}
		else if(a>=40 && a<=49)
		{
			System.out.println("Level -1,with grade E.");
		}
		else
		{
			System.out.println("Remedial Standards.");
		}
	}
}
		