import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class JMyNewHome extends JFrame implements ActionListener, ItemListener
{

	int aPrice = 100000, bPrice = 120000, cPrice = 180000, dPrice = 250000;
	int totalPrice=aPrice; // start with first house type selected

	int twoPrice = 21000, threePrice = 31500, fourPrice = 42000;
	
	int garagePrice = 7775, poolPrice = 4000;

	// create a ButtonGroup for models
	ButtonGroup modelGrp = new ButtonGroup();
	JRadioButton aRB = new JRadioButton("Aspen", true);
	JRadioButton bRB = new JRadioButton("Brittany", false);
	JRadioButton cRB = new JRadioButton("Colonial", false);
	JRadioButton dRB = new JRadioButton("Dartmoor", false);

	// create a ButtonGroup for bedrooms
	ButtonGroup bdrmGrp = new ButtonGroup();
	JRadioButton twoRB = new JRadioButton("2 bedrooms", false);
	JRadioButton threeRB = new JRadioButton("3 bedrooms", false);
	JRadioButton fourRB = new JRadioButton("4 bedrooms", false);
	
	// create options check boxes
	JCheckBox garageBox = new JCheckBox("Garage", false);
	JCheckBox poolBox = new JCheckBox("Pool", false);

	// TextField to display total
	JTextField totPrice = new JTextField(10);

	// 3 panels to be placed within Frame
	JPanel topPanel = new JPanel(new FlowLayout());
	JPanel middlePanel = new JPanel(new FlowLayout());
	JPanel bottomPanel = new JPanel(new FlowLayout());

	JButton exit = new JButton("Exit");

	Container con = getContentPane();

	public JMyNewHome() // constructor
	{
		super("My New Home");  // title for frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		con.setLayout(new BorderLayout());  // use BorderLayout

		// add radio buttons to respective button groups
		// also add listeners to each radio button
		modelGrp.add(aRB);
		aRB.addItemListener(this);
		modelGrp.add(bRB);
		bRB.addItemListener(this);
		modelGrp.add(cRB);
		cRB.addItemListener(this);
		modelGrp.add(dRB);
		dRB.addItemListener(this);
		bdrmGrp.add(twoRB);
		twoRB.addItemListener(this);
		bdrmGrp.add(threeRB);
		threeRB.addItemListener(this);
		bdrmGrp.add(fourRB);
		fourRB.addItemListener(this);

		// define fancy border for top panel, and add radio buttons
		Border topBorder = BorderFactory.createEtchedBorder();
		topBorder = BorderFactory.createTitledBorder(topBorder, "Model");
		topPanel.setBorder(topBorder);
		

		topPanel.add(aRB);
		topPanel.add(bRB);
		topPanel.add(cRB);
		topPanel.add(dRB);
		
		con.add(topPanel, BorderLayout.NORTH);



	}

	public static void main(String[] args)
	{
		JMyNewHome aFrame = new JMyNewHome();
		aFrame.setSize(450,225);
		aFrame.setResizable(false);
		aFrame.setVisible(true);
	}
	

	public void itemStateChanged(ItemEvent check)
	{

	}

	public void actionPerformed(ActionEvent e)	
	{

	}


}
