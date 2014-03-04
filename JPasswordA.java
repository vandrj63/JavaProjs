//JPasswordA.java
//chapter 16, Exercise 2a

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPasswordA extends JApplet implements ActionListener
{
	JLabel prompt = new JLabel("Enter your password:");
	JTextField pw = new JTextField("",10);
	JButton button1 = new JButton("Enter");
	JLabel result = new JLabel("");
	Font bigfont = new Font("TimesRoman", Font.BOLD, 24);
	Container con = getContentPane();
	FlowLayout flow = new FlowLayout();

	public void init()
	{
		con.setLayout(flow);
		con.add(prompt);
		con.add(pw);
		con.add(button1);
		con.add(result);
		button1.addActionListener(this);
		pw.requestFocus();
	}

	public void actionPerformed (ActionEvent e)
	{
		Object source = e.getSource();
		if(source == button1 && (pw.getText().equalsIgnoreCase("Rosebud") ))
			result.setText("Access Granted");
		else
			result.setText("Access Denied");
	}


}