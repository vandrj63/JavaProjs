import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.text.*;

public class FileCabinet extends JFrame implements ActionListener
{
	JButton buttonA = new JButton("A");
	JButton buttonB = new JButton("B");
	JButton buttonC = new JButton("C");
	JButton buttonD = new JButton("D");
	JButton buttonE = new JButton("E");
	JButton buttonF = new JButton("F");
	JButton buttonG = new JButton("G");
	JButton buttonH = new JButton("H");
	JButton buttonI = new JButton("I");
	JButton buttonJ = new JButton("J");
	JButton buttonK = new JButton("K");
	JButton buttonL = new JButton("L");  
	JButton buttonM = new JButton("M");
	JButton buttonN = new JButton("N");
	JButton buttonO = new JButton("O");
	JButton buttonP = new JButton("P");
	JButton buttonQ = new JButton("Q");
	JButton buttonR = new JButton("R");
	JButton buttonS = new JButton("S");
	JButton buttonT = new JButton("T");
	JButton buttonU = new JButton("U");
	JButton buttonV = new JButton("V");
	JButton buttonW = new JButton("W");
	JButton buttonX = new JButton("X");
	JButton buttonY = new JButton("Y");
	JButton buttonZ = new JButton("Z");
	Container con = getContentPane();

	JMenuBar mainbar = new JMenuBar();
	JMenu file = new JMenu("File");
	JMenuItem exit = new JMenuItem("Exit");

	JPanel topPanel = new JPanel(new FlowLayout());
	JPanel centerPanel = new JPanel(new GridLayout(5,1));
	JPanel bottomPanel = new JPanel(new FlowLayout());

	JLabel top = new JLabel("File Cabinet");
	JLabel bottom = new JLabel("Folder: ");
	JLabel folder = new JLabel("");
	JLabel blank1 = new JLabel("");
	JLabel blank2 = new JLabel("");
	JLabel blank3 = new JLabel("");
	JLabel blank4 = new JLabel("");
	
	JPanel one = new JPanel(new GridLayout(1,6));
	JPanel two = new JPanel(new GridLayout(1,6));
	JPanel three = new JPanel(new GridLayout(1,6));
	JPanel four = new JPanel(new GridLayout(1,6));
	JPanel five = new JPanel(new GridLayout(1,6));
	
	public FileCabinet()
{
	super("File Cabinet");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.setLayout(new BorderLayout());
	con.add(topPanel, BorderLayout.NORTH);
        con.add(centerPanel, BorderLayout.CENTER);
        con.add(bottomPanel, BorderLayout.SOUTH);

	Font myFont = new Font("Arial", Font.BOLD, 24);
	topPanel.setBackground(Color.blue);
	top.setFont(myFont);
	top.setForeground(Color.white);

	setJMenuBar(mainbar);
	mainbar.add(file);
	file.add(exit);
	exit.addActionListener(this);
	
	centerPanel.add(one);
	centerPanel.add(two);
	centerPanel.add(three);
	centerPanel.add(four);
	centerPanel.add(five);

	topPanel.add(top);
	
	bottomPanel.add(bottom);
	bottomPanel.add(folder);
	
	one.add(buttonA);
	buttonA.addActionListener(this);
	one.add(buttonB);
	buttonB.addActionListener(this);
	one.add(buttonC);
	buttonC.addActionListener(this);
	one.add(buttonD);
	buttonD.addActionListener(this);
	one.add(buttonE);
	buttonE.addActionListener(this);
	one.add(buttonF);
	buttonF.addActionListener(this);
	
	two.add(buttonG);
	buttonG.addActionListener(this);
	two.add(buttonH);
	buttonH.addActionListener(this);
	two.add(buttonI);
	buttonI.addActionListener(this);
	two.add(buttonJ);
	buttonJ.addActionListener(this);
	two.add(buttonK);
	buttonK.addActionListener(this);
	two.add(buttonL);
	buttonL.addActionListener(this);
	
	three.add(buttonM);
	buttonM.addActionListener(this);
	three.add(buttonN);
	buttonN.addActionListener(this);
	three.add(buttonO);
	buttonO.addActionListener(this);
	three.add(buttonP);
	buttonP.addActionListener(this);
	three.add(buttonQ);
	buttonQ.addActionListener(this);
	three.add(buttonR);
	buttonR.addActionListener(this);
	
	four.add(buttonS);
	buttonS.addActionListener(this);
	four.add(buttonT);
	buttonT.addActionListener(this);
	four.add(buttonU);
	buttonU.addActionListener(this);
	four.add(buttonV);
	buttonV.addActionListener(this);
	four.add(buttonW);
	buttonW.addActionListener(this);
	four.add(buttonX);
	buttonX.addActionListener(this);
	
	five.add(blank1);
	five.add(blank2);
	five.add(buttonY);
	buttonY.addActionListener(this);
	five.add(buttonZ);
	buttonZ.addActionListener(this);
	five.add(blank3);
	five.add(blank4);	
}
	public static void main(String[] arguments)
	{
		Image im = Toolkit.getDefaultToolkit().getImage("Folder.gif");
		FileCabinet aFrame = new FileCabinet();
		aFrame.setIconImage(im);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aFrame.setSize(500, 300);
		aFrame.setResizable(false);
		aFrame.setVisible(true); 
	}
		public void actionPerformed(ActionEvent e)
{
	Object source = e.getSource();
	if(source == buttonA)
	{
			folder.setText("A");
	}
	if(source == buttonB)
	{
			folder.setText("B");
	}
	if(source == buttonC)
	{
			folder.setText("C");
	}
	if(source == buttonD)
	{
			folder.setText("D");
	}
	if(source == buttonE)
	{
			folder.setText("E");
	}
	if(source == buttonF)
	{
			folder.setText("F");
	}
	if(source == buttonG)
	{
			folder.setText("G");
	}
	if(source == buttonH)
	{
			folder.setText("H");
	}
	if(source == buttonI)
	{
			folder.setText("I");
	}
	if(source == buttonJ)
	{
			folder.setText("J");
	}
	if(source == buttonJ)
	{
			folder.setText("J");
	}
	if(source == buttonK)
	{
			folder.setText("K");
	}
	if(source == buttonL)
	{
			folder.setText("L");
	}
	if(source == buttonM)
	{
			folder.setText("M");
	}
	if(source == buttonN)
	{
			folder.setText("N");
	}
	if(source == buttonO)
	{
			folder.setText("O");
	}
	if(source == buttonP)
	{
			folder.setText("P");
	}
	if(source == buttonQ)
	{
			folder.setText("Q");
	}
	if(source == buttonR)
	{
			folder.setText("R");
	}
	if(source == buttonS)
	{
			folder.setText("S");
	}
	if(source == buttonT)
	{
			folder.setText("T");
	}
	if(source == buttonU)
	{
			folder.setText("U");
	}
	if(source == buttonV)
	{
			folder.setText("V");
	}
	if(source == buttonW)
	{
			folder.setText("W");
	}
	if(source == buttonX)
	{
			folder.setText("X");
	}
	if(source == buttonY)
	{
			folder.setText("Y");
	}
	if(source == buttonZ)
	{
			folder.setText("Z");
	}
	if(source == exit){
		System.exit(0);
	}
}
}
