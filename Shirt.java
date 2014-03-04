//shirt.java
//Chapter 4, Exercise 5(page 182)

public class Shirt
{
	private int collarSize,
	    sleeveLength;
	private final static String MATERIAL = "cotton";

	Shirt(int x, int y)
	{
		collarSize = x;
		sleeveLength = y;
		

	}
	public void display()
	{
		System.out.println("The collar size is " + 
		collarSize + ", the sleeve length is " +
		sleeveLength + ", and the material is " +
		MATERIAL);	
	}



}