public class TestHousehold
{
	
	public static void main(String[] args)
		
	{
		Household one = new Household();
		System.out.println("The house before using the set methods has " + one.getoccupants() + 
		" occupants and an income of $ " + one.getincome());
		
	
	one.setoccupants(3);
	one.setincome(55000.00);
	
	System.out.println("The revised house has " + one.getoccupants() + " occupants and an income of $" + one.getincome());	

	one.setoccupants(2);
	one.setincome(0.00);
	
	System.out.println("The second house has " + one.getoccupants() + " occupants and an income of $" + one.getincome());
	
	
	one.setoccupants(7);
	one.setincome(80000.00);
	
	System.out.println("The third house has " + one.getoccupants() + " occupants and an income of $" + one.getincome());

	}

}