import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Assignment6 extends JApplet implements ActionListener
{
	JLabel loan = new JLabel("Loan Amount");
	JTextField int1 = new JTextField("",10);
	JLabel rate = new JLabel("Yearly Interest Rate");
	JTextField int2 = new JTextField("",10);
	JLabel month = new JLabel("Number of Loan Months");
	JTextField int3 = new JTextField("",10);
	JButton button1 = new JButton("Calculate");
	JButton button2 = new JButton("Reset");
	JLabel payment = new JLabel("Amount of Payment");
	JTextField result1 = new JTextField("",10);
	JLabel total = new JLabel("Total Payments");
	JTextField result2 = new JTextField("",10);
	Font bigfont = new Font("TimesRoman", Font.BOLD, 24);
	Container con = getContentPane();
	FlowLayout flow = new FlowLayout();

	public void init()
	{
		con.setLayout(flow);
		con.add(loan);
		con.add(int1);
		con.add(rate);
		con.add(int2);
		con.add(month);
		con.add(int3);
		con.add(button1);
		button1.addActionListener(this);
		con.add(button2);
		button2.addActionListener(this);
		con.add(payment);
		con.add(result1);
		con.add(total);
		con.add(result2);
		int1.requestFocus();
	}

	public void actionPerformed (ActionEvent e)
	{
		Object source = e.getSource();
		
		if(source == button1)
		{
			DecimalFormat df = new DecimalFormat();
			df.setMaximumFractionDigits(2);
			df.setMinimumFractionDigits(2);
			
			boolean good = true;
				
				String a = int1.getText();
				String b = int2.getText();
				String c = int3.getText();
				for(int x=0; x<a.length(); ++x){
              				if(!Character.isDigit(a.charAt(x)))
               					good=false;
						result1.setText("input ERROR");}
				for(int x=0; x<b.length(); ++x){
              				if(!Character.isDigit(b.charAt(x)))
               					good=false;
						result1.setText("input ERROR");}
				for(int x=0; x<c.length(); ++x){
              				if(!Character.isDigit(c.charAt(x)))
               					good=false;
						result1.setText("input ERROR");}
				double one = Double.parseDouble(a);
				double two = Double.parseDouble(b);
				double three = Double.parseDouble(c);
				double total = (one*two/12*Math.pow(two/12+1, three)) / (Math.pow(two/12+1, three)-1);
				double total2 = total * three;
				result1.setText("" + df.format(total));
				result2.setText("" + df.format(total2));
		}
		else
		{
			int1.setText("");
			int2.setText("");
			int3.setText("");
			result1.setText("");
			result2.setText("");
		}
		validate();
	}


}