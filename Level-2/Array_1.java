import java.util.Scanner;
class Array_1
{
	public static void main(String args[])
	{
		Scanner emp = new Scanner(System.in);
        System.out.println("Enter the Employees.");
        int emp = 10;
        double[] sal = new double[emp];
        double[] ser = new double[emp];
		double[] bonus = new double[emp];
		double[] new_sal = new double[emp];
		double[] tot_bonus = 0;
		double[] totsalold = 0;
		double[] totsalnew = 0;
		
		for(int i=0;i<emp;i++)
		{
			System.out.println("Enter Salary:"+(i+1+":"));
			sal[i] = emp.nextDouble();
			System.out.println("Enter Years Served:"(i+1)+":");
			years[i] = emp.nextDouble();
			if(years[i]>5)
			{
				bonus[i] = sal[i]*0.05;
			}
			else
			{
				bonus[i] = sal[i]*0.02;
			}
			
			new_sal[i] = sal[i]+bonus[i];
			tot_bonus +=bonus[i];
			totsalold+=sal[i];
			totsalnew+=new_sal[i];
		}
		System.out.println("Total Bonus:"+tot_bonus);
		System.out.println("Total Old Salary:"+totsalold);
		System.out.println("Total New Salary:"+totsalnew);
	}
}