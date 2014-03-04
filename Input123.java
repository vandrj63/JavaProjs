//Page 267, Excercise #2
//Accepts input untill user quits

import java.util.Scanner;// for input

public class Input123
{
	public static void main (String[] args)
	{
		Scanner console = new Scanner(System.in);
		int x;

		System.out.print("Enter 1, 2 or 3, or 4 to quit: ");		
		x = console.nextInt();
		
		while(x != 4)
		{
			if(x == 1 || x == 2 || x == 3)
				System.out.println("Good job!");
			else
				System.out.println("You should enter 1, 2, 3, or 4");

		System.out.print("Enter 1, 2 or 3, or 4 to quit: ");		
		x = console.nextInt();
		}

	}
}
	