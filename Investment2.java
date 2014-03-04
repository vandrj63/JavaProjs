import java.util.Scanner;
import java.text.DecimalFormat;

public class Investment2
{
	public static void main(String args[])
	{
		Scanner key = new Scanner(System.in);
		
		int years;
		double investment, interest, amount, percent;

		System.out.print("Enter investment amount: ");
		investment = key.nextDouble();
		
		System.out.print("Enter number of years: ");
		years = key.nextInt();
		
		System.out.print("Enter interest rate (as a decimal): ");
		interest = key.nextDouble();
		
		percent = interest * 100;
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		
		if(years == 0 || interest == 0)
			System.out.println("\nNot enough information - amount and term must be non-zero");
		
		if(years > 0 && interest > 0.0)
			System.out.println("\nYour Investment at " + percent +"% is:");
			System.out.println("  ");		

		for(int y = 1; y <= years; y++)
		{
			
			if(years > 0 && interest > 0.0)
			{ 
				investment= investment * interest + investment;
				System.out.println("After year " + y + "\t $" + df.format(investment));
			}
		}
	

	}



}