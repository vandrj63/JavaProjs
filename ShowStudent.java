public class ShowStudent
{
	public static void main(String[] args)
	{
		// instantiate a new Student object
		Student joe = new Student("3333");
		Student Dorthea = new Student();

		System.out.println("ID: " + joe.getIDNumber());
		System.out.println("Points: " + joe.getPoints());
		System.out.println("Hours: " + joe.getHours());	

		joe.setIDNumber("1234");
		joe.setPoints(12);
		joe.setHours(3);

		System.out.println("ID: " + joe.getIDNumber());
		System.out.println("Points: " + joe.getPoints());
		System.out.println("Hours: " + joe.getHours());	

		System.out.println("GPA:  "  + joe.calcGPA());

	}

}
