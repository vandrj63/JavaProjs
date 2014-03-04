import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class BarChart extends JFrame implements ActionListener
{
    JLabel first= new JLabel("High Risk:");
    JLabel label= new JLabel("Enter 4 dollar amounts to your investment portfolio:");
    JTextField firstIn = new JTextField("", 5);
    JLabel second = new JLabel("Medium Risk:");
    JTextField secondIn = new JTextField("", 5);
    JLabel third = new JLabel("Low Risk:");
    JTextField thirdIn = new JTextField("", 5);
    JLabel fourth = new JLabel("No Risk:");
    JTextField fourthIn = new JTextField("", 5);
    JButton button1 = new JButton("Bar Chart");
    JButton button2 = new JButton("Pie Chart");
    JButton button3 = new JButton("Clear");
    DecimalFormat df = new DecimalFormat();

    

    Container con = getContentPane();
    FlowLayout flow = new FlowLayout();

    JPanel topPanel = new JPanel(new GridLayout (3,1));
    JPanel centerPanel = new JPanel();

    JPanel topone = new JPanel();
    JPanel toptwo = new JPanel();
    JPanel topthree = new JPanel(new GridLayout (1, 3));

    boolean barOn = false;
    boolean pieOn = false;

    public BarChart()
    {
	super("Charting Application");
	con.setLayout(new BorderLayout());
	first.setForeground(Color.red);
	second.setForeground(Color.orange);
	third.setForeground(Color.blue);
	fourth.setForeground(Color.green);

	topPanel.add(topone);
	topPanel.add(toptwo);
	topPanel.add(topthree);
	topone.add(label);
	toptwo.add(first);
	toptwo.add(firstIn);
	toptwo.add(second);
	toptwo.add(secondIn);
	toptwo.add(third);
	toptwo.add(thirdIn);
	toptwo.add(fourth);
	toptwo.add(fourthIn);
	topthree.add(button1);
	button1.addActionListener(this);
	topthree.add(button2);
	button2.addActionListener(this);
	topthree.add(button3);
	button3.addActionListener(this);

	con.add(topPanel, BorderLayout.NORTH);
	con.add(centerPanel, BorderLayout.CENTER);

	firstIn.requestFocus();
	topPanel.repaint();
    }

    public void actionPerformed(ActionEvent e)
    {
	Object source = e.getSource();
	if (source == button1)
	{
	   barOn=true;
   	   repaint();
	}
	if(source == button2)
	{
	   pieOn=true;
	   repaint();
	}
	if(source == button3)
	{
	   firstIn.setText("");
	   secondIn.setText("");
	   thirdIn.setText("");
	   fourthIn.setText("");
	   repaint();
	}
	

	topPanel.repaint();


    }

    public void paint(Graphics gr)
    {
	super.paint(gr);
	df.setMaximumFractionDigits(1);
	df.setMinimumFractionDigits(1);
		
	gr.setColor(Color.white);
	gr.fillRect(0,0,getWidth(),getHeight());
	topPanel.repaint();

	if(barOn)
	{
	  int barWidth=(int)((getWidth() - 20.0)/4-10);
	  int maxBarHeight = getHeight() - 200;
	  gr.setColor(Color.black);
	  gr.drawLine(5, getHeight()-15,getWidth()-5,getHeight()-15);

  	  double in1 = Double.parseDouble(firstIn.getText());
	  double in2 = Double.parseDouble(secondIn.getText());
	  double in3 = Double.parseDouble(thirdIn.getText());
	  double in4 = Double.parseDouble(fourthIn.getText());

	  double max=in1;
	  if (in2>max) {max=in2;}
	  if (in3>max) {max=in3;}
	  if (in4>max) {max=in4;}
	  int x=15;

	  double total=in1+in2+in3+in4;

	  gr.setColor(Color.red);
	  int newHeight=(int)(maxBarHeight*in1/max);
	  int y = getHeight()-15-newHeight;
	  gr.fillRect(x,y,barWidth,newHeight);
	  gr.drawString(df.format((in1/total*100))+"%", (x+(barWidth/2)-17), y - 7);

	  gr.setColor(Color.orange);
	  x += barWidth + 10;
	  newHeight=(int)(maxBarHeight*in2/max);
	  y = getHeight()-15-newHeight;
	  gr.fillRect(x,y,barWidth,newHeight);
	  gr.drawString(df.format((in2/total*100))+"%", (x+(barWidth/2)-17), y - 7);	

	  gr.setColor(Color.blue);
	  x += barWidth + 10;
	  newHeight=(int)(maxBarHeight*in3/max);
	  y = getHeight()-15-newHeight;
	  gr.fillRect(x,y,barWidth,newHeight);
	  gr.drawString(df.format((in3/total*100))+"%", (x+(barWidth/2)-17), y - 7);

	  gr.setColor(Color.green);
	  x += barWidth + 10;
	  newHeight=(int)(maxBarHeight*in4/max);
	  y = getHeight()-15-newHeight;
	  gr.fillRect(x,y,barWidth,newHeight);
	  gr.drawString(df.format((in4/total*100))+"%", (x+(barWidth/2)-17), y - 7);

	  gr.setColor(Color.blue);
	  gr.setFont(new Font("Arial", Font.ITALIC, 16));
	  gr.drawString("Your Investment Portfolio",(getWidth()/2-80),getHeight()-centerPanel.getHeight()+15);   

	  barOn=false;
	}
	
	if(pieOn)
 	{
	   double in1 = Double.parseDouble(firstIn.getText());
	   double in2 = Double.parseDouble(secondIn.getText());
	   double in3 = Double.parseDouble(thirdIn.getText());
	   double in4 = Double.parseDouble(fourthIn.getText());

	   double a, b, c, d, total = 0;
	   total = in1 + in2 + in3 + in4;
           System.out.println(total);
	   
	   double P1 = (in1 / total) * 100;
	   System.out.println(P1);
           
	   a = (in1 / total) * 360;
	   System.out.println(a);
	
	   double P2 = (in2 / total) * 100;
	   System.out.println(P2);

	   b = (in2 / total) * 360;
	   System.out.println(b);

	   double P3 = (in3 / total) * 100;
	   System.out.println(P3);
	  
	   c = (in3 / total) * 360;
	   System.out.println(c);
	
	   double P4 = (in4 / total) * 100;
	   System.out.println(P4);
	  
	   d = (in4 / total) * 360;
	   System.out.println(d);
	
           int one = (int)a;
	   int two = (int)b;
	   int three = (int)c;
	   int four = (int)d;

	   

           gr.setColor(Color.red);
	   gr.fillArc(300, 200, 150, 150, 0, one);

	   gr.setColor(Color.orange);
	   gr.fillArc(300, 200, 150, 150, one, two);
	   
           gr.setColor(Color.blue);
	   gr.fillArc(300, 200, 150, 150, one + two, three);
  	   
	   gr.setColor(Color.green);
	   gr.fillArc(300, 200, 150, 150, one + two + three, four);
	   
	   gr.setColor(Color.blue);
	   gr.setFont(new Font("Arial", Font.ITALIC, 16));
	   gr.drawString("Your Investment Portfolio",(getWidth()/2-80),getHeight()-centerPanel.getHeight()+15);

           pieOn = false;

	   

	}
    }

    public static void main(String[] args)
    {
	Image im = Toolkit.getDefaultToolkit().getImage("Charts.jpg");
	BarChart f = new BarChart();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setIconImage(im);
	f.setSize(700,400);
	f.setVisible(true);
    }

}
