import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.text.*;

public class PizzaOrderApp extends JFrame implements ActionListener, ItemListener
{

double small = 6.99, medium = 8.99, large = 10.99, sau = 1.49, pep = 1.49, sal = 1.49, oli = 0.99, mush = 0.99, anch = 0.99;
double total = small;

ButtonGroup sizes = new ButtonGroup();
JRadioButton a = new JRadioButton("Small", true);
JRadioButton b = new JRadioButton("Medium", false);
JRadioButton c = new JRadioButton("Large", false);

JCheckBox A = new JCheckBox("Sausage", false);
JCheckBox B = new JCheckBox("Pepporoni", false);
JCheckBox C = new JCheckBox("Salami", false);
JCheckBox D = new JCheckBox("Olives", false);
JCheckBox E = new JCheckBox("Mushrooms", false);
JCheckBox F = new JCheckBox("Anchovies", false);

JButton exit = new JButton("Exit");

JPanel topPanel = new JPanel(new FlowLayout());
JPanel middlePanel = new JPanel(new FlowLayout());
JPanel bottomPanel = new JPanel(new FlowLayout());

JLabel last = new JLabel("Price");
JTextField price = new JTextField(10);

Container con = getContentPane();

NumberFormat currency = NumberFormat.getCurrencyInstance();

public PizzaOrderApp()
{
	super("Pizza Calculator");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	con.setLayout(new BorderLayout());

	sizes.add(a);
	a.addItemListener(this);
	sizes.add(b);
	b.addItemListener(this);
	sizes.add(c);
	c.addItemListener(this);
	
	Border topBorder = BorderFactory.createEtchedBorder();
	topBorder = BorderFactory.createTitledBorder(topBorder, "Size");
	topPanel.setBorder(topBorder);
	
	topPanel.add(a);
	topPanel.add(b);
	topPanel.add(c);
	
	con.add(topPanel,BorderLayout.NORTH);

	Border middleBorder = BorderFactory.createEtchedBorder();
	middleBorder = BorderFactory.createTitledBorder(middleBorder, "Toppings");
	middlePanel.setBorder(middleBorder);
	
	middlePanel.add(A);
	A.addItemListener(this);
	middlePanel.add(B);
	B.addItemListener(this);
	middlePanel.add(C);
	C.addItemListener(this);
	middlePanel.add(D);
	D.addItemListener(this);
	middlePanel.add(E);
	E.addItemListener(this);
	middlePanel.add(F);
	F.addItemListener(this);

	con.add(middlePanel, BorderLayout.CENTER);

	
	bottomPanel.add(last);
	price.setText(currency.format(total));
	bottomPanel.add(price);
	
	bottomPanel.add(exit);
	exit.addActionListener(this);

	con.add(bottomPanel, BorderLayout.SOUTH);
}

	public static void main(String[] arguements)
{
	PizzaOrderApp aFrame = new PizzaOrderApp();
	aFrame.setSize(350, 250);
	aFrame.setResizable(false);
	aFrame.setVisible(true);
}
	public void itemStateChanged(ItemEvent check)
{
	Object source = check.getItem();
	if(source == a)
	{
		double select = check.getStateChange();
		if(select == ItemEvent.SELECTED)
			total += small;
		else if(select == ItemEvent.DESELECTED)
			total -= small;
	}
	if(source == b)
	{
		double select = check.getStateChange();
		if(select == ItemEvent.SELECTED)
			total += medium;
		else if(select == ItemEvent.DESELECTED)
			total -= medium;
	}
	if(source == c)
	{
		double select = check.getStateChange();
		if(select == ItemEvent.SELECTED)
			total += large;
		else if(select == ItemEvent.DESELECTED)
			total -= large;
	}
	if(source == A)
	{
		double select = check.getStateChange();
		if(select == ItemEvent.SELECTED)
			total += sau;
		else if(select == ItemEvent.DESELECTED)
			total -= sau;
	}
	if(source == B)
	{
		double select = check.getStateChange();
		if(select == ItemEvent.SELECTED)
			total += pep;
		else if(select == ItemEvent.DESELECTED)
			total -= pep;
	}
	if(source == C)
	{
		double select = check.getStateChange();
		if(select == ItemEvent.SELECTED)
			total += sal;
		else if(select == ItemEvent.DESELECTED)
			total -= sal;
	}
	if(source == D)
	{
		double select = check.getStateChange();
		if(select == ItemEvent.SELECTED)
			total += oli;
		else if(select == ItemEvent.DESELECTED)
			total -= oli;
	}
	if(source == E)
	{
		double select = check.getStateChange();
		if(select == ItemEvent.SELECTED)
			total += mush;
		else if(select == ItemEvent.DESELECTED)
			total -= mush;
	}
	if(source == F)
	{
		double select = check.getStateChange();
		if(select == ItemEvent.SELECTED)
			total += anch;
		else if(select == ItemEvent.DESELECTED)
			total -= anch;
	}
	price.setText(currency.format(total));
}

	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source == exit)
			System.exit(0);
	}
}