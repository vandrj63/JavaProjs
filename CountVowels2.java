//CountVowels.java
//Page 302, Exercise #2

import java.util.Scanner;

public class CountVowels2
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		System.out.print("\nEnter a string: ");
		String astring = key.nextLine();

		int numVowels = 0;
		
		int stringLength = aString.length();
		for(int i = 0;i < stringLength; i++)
		{
			char ch = Character.toLowerCase(aString.charAt(i));
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				numVowels++;
		}
		System.out.println("\nThe number of vowels is: " +numVowels);
	}



}