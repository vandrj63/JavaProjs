//JPasswordA.java
//chapter 16, Exercise 2a

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JAdd extends JApplet implements ActionListener
{
	JLabel prompt = new JLabel("Enter two integers:");
	JTextField int1 = new JTextField("",5);
	JTextField int2 = new JTextField("",5);
	JButton button1 = new JButton("ADD");
	JLabel result = new JLabel("");
	Font bigfont = new Font("TimesRoman", Font.BOLD, 24);
	Container con = getContentPane();
	FlowLayout flow = new FlowLayout();

	public void init()
	{
		con.setLayout(flow);
		con.add(prompt);
		con.add(int1);
		con.add(int2);
		con.add(button1);
		button1.addActionListener(this);
		con.add(result);
		int1.requestFocus();
	}

	public void actionPerformed (ActionEvent e)
	{
		Object source = e.getSource();
		if(source == button1)
		{
			String a = int1.getText();
			String b = int2.getText();
			int one = Integer.parseInt(a);
			int two = Integer.parseInt(b);
			int total = one + two;
			result.setText("Sum is: " + total);
		}
	}


}