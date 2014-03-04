public class Student
{
	private String IDNumber;
	private int hours;
	private int points;

	// constructor
	Student()
	{
		IDNumber = "9999";
	}
	Student(String ID)
	{
		IDNumber = ID;
	}
	

	// set methods
	public void setIDNumber(String ID)
	{
		IDNumber = ID;
	}

	public void setHours(int hrs)
	{
		hours = hrs;
	}

	public void setPoints(int pts)
	{
		points = pts;
	}

	// get methods
	public String getIDNumber()
	{
		return IDNumber;
	}

	public int getHours()
	{
		return hours;
	}

	public int getPoints()
	{
		return points;
	}

	public double calcGPA()
	{
		return (double)points/hours;

	}
}
