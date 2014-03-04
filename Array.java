import java.util.Scanner;

public class Array
{
	public static void values(int[] list)
	{
	for(int i = 0; i < list.length; i++)
		System.out.println(list[i]);
	}
	
		
	

	public static double Average(int[] list)
	{
		int sum = 0;
		double average;
		for(int i = 0; i < list.length; i++)
		sum = sum + list[i];	
		average = sum / list.length;
		return average;
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
	
	public static void sortedData(int[] list)
	{
	int x, y;
	int temp;
	int z = list.length - 1;
	for(x = 0; x < z; ++x)
	   for(y = 0; y < z; ++y)
		if(list[y] > list[y + 1])
		{
			temp = list[y];
			list[y] = list[y + 1];
			list[y + 1] = temp;
		}
	}
	
	public static double median(int[] list)
	{
		double median;
		if(list.length % 2 == 0)
		{
			median = ((list[list.length / 2] - 1) + list[list.length / 2]) / 2;
		}
		else
		{
			median = list[list.length / 2];
			
		}
		return median;
	}
public static void main(String[] args)
	{
		int x;
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		
		x = console.nextInt();
		
		int arr[] = new int[x];
		
		for(int i = 0; i < arr.length; i++)
		{
		System.out.print("Enter the value #" + (i+1) + ": ");
		arr[i] = console.nextInt();		
		}
		System.out.println("Your data is: ");
		values(arr);
		System.out.println("Average is: " + Average(arr));
		System.out.println("Smallest value is: " + SmallestInArray(arr));
		System.out.println("Largest value is: " + LargestInArray(arr));		
		System.out.println(" ");
		System.out.println("Your sorted data is: ");
		sortedData(arr);
		values(arr);
		System.out.println("Median is: " + median(arr));

	}

}