import javax.swing.JOptionPane;

public class DemoJOptionPane
{
	public static void main(String[] args)
	{
		String name;
		name=JOptionPane.showInputDialog
			(null,"Enter your name","Name",JOptionPane.QUESTION_MESSAGE);

		int hours;
		hours=Integer.parseInt(JOptionPane.showInputDialog
			(null,"Enter hours worked","Hours",JOptionPane.QUESTION_MESSAGE));
		
		double rate;
		rate=Double.parseDouble(JOptionPane.showInputDialog
			(null,"Enter hourly rate","Rate",JOptionPane.QUESTION_MESSAGE));

		double total = hours * rate;
		
		JOptionPane.showMessageDialog(null,"Payroll Information:\n" + name
			+ "\'s payroll amount is $"
			+ total, "Payroll",JOptionPane.PLAIN_MESSAGE);

		System.exit(0); // not required
	}

}