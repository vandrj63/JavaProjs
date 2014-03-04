public class Household
{
	int occupants;
	double income;
	
	public void setHousehold()
	{
		occupants = 1;
		income = 0.00;
		
	}
	
	public void setoccupants(int occ)
	{
		occupants = occ;
	}
	
	public void setincome(double in)
	{
		income = in;

	}

	public int getoccupants()
	{
		return occupants;
	}
	
	public double getincome()
	{
		return income;
	}
		




}