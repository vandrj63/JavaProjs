public class Box
{
	private int length;
	private int width;
	private int height;

	//constructors
	Box(int len)
	{
		length = len;
		width = 0;
		height = 0;
		System.out.println("Line Created");
	}
	Box(int len, int wid)
	{
		length = len;
		width = wid;
		height = 0;
		System.out.println("Rectangle Created");
	}
	Box(int len, int wid, int hei)
	{
		length = len;
		width = wid;
		height = hei;
		System.out.println("Box Created");
	}



}