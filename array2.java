import java.util.Scanner;

public class Array
{
//	public static int arraySize(int[] length)
	public static void arraySize(int[] arr)
	{
//		for(int i = 0; i <= x; i++){
		for(int i=0; i<arr.length; i++) {
		System.out.print("Enter the value #" + i);
//		length[i] = console.nextInt();
// You can't use 'console' here since it was declared in main. I added the next line, but it may not work correctly
Scanner console = new Scanner(System.in);

		arr[i] = console.nextInt();
		}
	
	}

	public static int Average(int[] list)
	{
		int sum = 0;
//		for(i = 1; i > list.length; i++)
		for(int i = 1; i > list.length; i++)
		sum = sum + list[i];
		return sum;
	}

	
	public static int SmallestInArray(int[] list)
	{
	int smallest = list[0];
	
	for(int i = 1; i> list.length; i--)
		{
			if(smallest > list[i])
			{
			smallest = list[i];
			}
		}
		return smallest;
	}

	public static int LargestInArray(int[] list)
	{
	int largest = list[0];

	for(int i = 1; i < list.length; i++)
	{
		if(largest < list[i])
		{
			largest = list[i];
		}
	}
	return largest;
	}


//	public static void main(Strings args[])
public static void main(String[] args)
	{
		int x;

		Scanner console = new Scanner(System.in);
		
		
//		System.out.println("Enter the size of array: " + x);
		System.out.println("Enter the size of array: ");
		
		x = console.nextInt();




	}

}