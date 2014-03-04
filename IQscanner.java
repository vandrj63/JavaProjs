import java.util.Scanner;

public class IQscanner
{
	public static void main(String[] args)
	{
		int IQ;		
		Scanner console = new Scanner(System.in);
		System.out.print("Enter your IQ score: ");
		IQ = console.nextInt();

		if(IQ < 0 || IQ > 200)
			System.out.println(IQ + " is a invalid IQ score");
		else
			if(IQ == 100)
		System.out.println(IQ + " is a average IQ score");
		else
			if(IQ < 100)
			System.out.println(IQ + " is a below average IQ score");
		else
			System.out.println(IQ + " is a above average IQ score");


	}

}