import javax.swing.JOptionPane;

public class Picnic
{
	public static void main (String[] args)
	{
		String budget;
		budget = JOptionPane.showInputDialog
			(null, "Enter your budget","budget",JOptionPane.QUESTION_MESSAGE);

		JOptionPane.showMessageDialog
			(null, "Lunch consist of:\n"+
			"3 apples, at $0.25\n"+ 
			"0.5lb of cheese at $3.99 a pound\n"+
			"1 loaf(s) of bread at $1.19");
		
		Double apple_cost = 0.25,
			bread_cost = 1.19,
			cheese_cost = 3.99,
			apple_q = 3.0,
			bread_q = 1.0,
			cheese_q = 0.5;
		
		
		Double total; 
		total = (apple_cost * apple_q + bread_cost * bread_q + cheese_cost * cheese_q);
		
		
		JOptionPane.showMessageDialog
		(null, "The total is: $" + total + "\nWithin your budget? true");
		


	}



}