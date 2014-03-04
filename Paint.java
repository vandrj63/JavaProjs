import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.Hashtable;

public class Paint extends JFrame implements ActionListener, MouseListener, MouseMotionListener//, ChangeListener

{
  ImageIcon red = new ImageIcon("red.gif");
  JButton redbutton = new JButton(red);
  ImageIcon blue = new ImageIcon("blue.gif");
  JButton bluebutton = new JButton(blue);
  ImageIcon green = new ImageIcon("green.gif");
  JButton greenbutton = new JButton(green);
  ImageIcon yellow = new ImageIcon("yellow.gif");
  JButton yellowbutton = new JButton(yellow);
  
  ImageIcon brush = new ImageIcon("brush.jpg");
  JButton brushbutton = new JButton(brush);
  ImageIcon eraser = new ImageIcon("eraser.jpg");
  JButton eraserbutton = new JButton(eraser);
  ImageIcon pencil = new ImageIcon("pencil.JPG");
  JButton pencilbutton = new JButton(pencil);
  ImageIcon text1 = new ImageIcon("text.JPG");
  JButton textbutton = new JButton(text1);

  JLabel text = new JLabel("Enter text. then click location:");
  JTextField input = new JTextField("", 35);
  JLabel about1 = new JLabel("");

  JMenuBar mainbar = new JMenuBar();
  JMenu file = new JMenu("File");
  JMenu help = new JMenu("Help");
  JMenuItem exit = new JMenuItem("Exit");
  JMenuItem clear = new JMenuItem("New");
  JMenuItem about = new JMenuItem("About Me");

  JLabel sLabel = new JLabel("Stroke:");
  
  JPanel topPanel = new JPanel();
  JPanel centerPanel = new JPanel();
  JPanel southPanel = new JPanel(new GridLayout (2,2));
  JPanel westPanel = new JPanel(new GridLayout(6,1));

  int last_x=-10;
  int last_y=-10;
  int xpos=-10;
  int ypos=-10;
  Color drawColor = (Color.black);

  boolean Eraser = false;
  boolean Pencil = false;
  boolean Brush = false;
  boolean Text = false;
  boolean Red = false;
  boolean Yellow = false;
  boolean Green = false;
  boolean Blue = false;
  


  Container con = getContentPane();

  public Paint()
  {
    super("My Paint Program");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    con.setLayout(new BorderLayout());
    con.add(topPanel, BorderLayout.NORTH);
    con.add(centerPanel, BorderLayout.CENTER);
    con.add(southPanel, BorderLayout.SOUTH);
    con.add(westPanel, BorderLayout.WEST);
  
    setJMenuBar(mainbar);
    mainbar.add(file);
    mainbar.add(help);
    file.add(clear);
    file.add(exit);
    help.add(about);
    exit.addActionListener(this);
    clear.addActionListener(this);
    about.addActionListener(this);

    topPanel.add(text);
    topPanel.add(input);

    centerPanel.setBackground(Color.white);
    westPanel.setBackground(Color.white);

    centerPanel.add(about1);

    westPanel.add(eraserbutton);
    eraserbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
    eraserbutton.addActionListener(this);
    
    westPanel.add(pencilbutton);
    pencilbutton.setBorder(new BevelBorder(BevelBorder.LOWERED));
    pencilbutton.addActionListener(this);
    
    westPanel.add(brushbutton);
    brushbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
    //brushbutton.addActionListener(this);
    
    westPanel.add(textbutton);
    textbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
    //textbutton.addActionListener(this);
  
    westPanel.add(sLabel);

    JSlider slider = new JSlider(JSlider.VERTICAL, 0, 2, 2);
    slider.setMinorTickSpacing(1);
    slider.setMajorTickSpacing(1);
    slider.setPaintTicks(true);
    slider.setPaintLabels(true);
    slider.setSnapToTicks(true);
    Hashtable<Integer, JLabel> labelTable = new Hashtable<Integer, JLabel>();
    labelTable.put(new Integer( 0 ), new JLabel("Thin") );
    labelTable.put(new Integer(2), new JLabel("Thick") );
    slider.setLabelTable(labelTable);
    //slider.addChangeListener(this);
    westPanel.add(slider);

    southPanel.add(redbutton);
    redbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
    redbutton.addActionListener(this);
    
    southPanel.add(yellowbutton);
    yellowbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
    yellowbutton.addActionListener(this);
    
    southPanel.add(greenbutton);
    greenbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
    greenbutton.addActionListener(this);
    
    southPanel.add(bluebutton);
    bluebutton.setBorder(new BevelBorder(BevelBorder.RAISED));
    bluebutton.addActionListener(this);

    addMouseListener(this);
    addMouseMotionListener(this);


  }
    
    public void actionPerformed(ActionEvent e)
    {
       Object source = e.getSource();
       if(source == eraserbutton)
         {
            Eraser = true;
            drawColor = (Color.WHITE);
            eraserbutton.setBorder(new BevelBorder(BevelBorder.LOWERED));
	    pencilbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
 	    brushbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
 	    textbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
         }
        
       if(source == pencilbutton)
         {
            Pencil = true;
	    eraserbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
	    pencilbutton.setBorder(new BevelBorder(BevelBorder.LOWERED));
 	    brushbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
 	    textbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
         }
       if(source == redbutton)
         {
            Red = true;
	    drawColor=(Color.RED);
            redbutton.setBorder(new BevelBorder(BevelBorder.LOWERED));
	    yellowbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
 	    greenbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
 	    bluebutton.setBorder(new BevelBorder(BevelBorder.RAISED));

         }
       if(source == yellowbutton)
         {
            Yellow = true;
	    drawColor=(Color.YELLOW);
            redbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
	    yellowbutton.setBorder(new BevelBorder(BevelBorder.LOWERED));
 	    greenbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
 	    bluebutton.setBorder(new BevelBorder(BevelBorder.RAISED));

         }
       if(source == greenbutton)
         {
            Green = true;
	    drawColor=(Color.GREEN);
            redbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
	    yellowbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
 	    greenbutton.setBorder(new BevelBorder(BevelBorder.LOWERED));
 	    bluebutton.setBorder(new BevelBorder(BevelBorder.RAISED));

         }
       if(source == bluebutton)
         {
            Blue = true;
	    drawColor=(Color.BLUE);
            redbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
	    yellowbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
 	    greenbutton.setBorder(new BevelBorder(BevelBorder.RAISED));
 	    bluebutton.setBorder(new BevelBorder(BevelBorder.LOWERED));

         }
       if(source == exit){
	   System.exit(0);
	}
       if(source == clear){
           repaint();
       }
       if(source == about){
          about1.setText("Created by Ryan VanDenburgh");
       }
    }
  
    public void mouseDragged(MouseEvent evt)
    {
    if(Pencil == true)
     {
       
       xpos=evt.getX();
       ypos=evt.getY();
       Graphics g = getGraphics();
       g.setColor(drawColor);
       g.drawLine(last_x,last_y,xpos,ypos);
       last_x = xpos;
       last_y = ypos;


//       Pencil = false;

      }
     
    if(Eraser == true)
       xpos=evt.getX();
       ypos=evt.getY();
       Graphics w = getGraphics();
       w.drawLine(last_x,last_y,xpos,ypos);
       last_x = xpos;
       last_y = ypos;
       
       Eraser = false;
    }
    
    public void mousePressed(MouseEvent evt)
    {
      last_x = evt.getX();
      last_y = evt.getY();
    }

    public void mouseMoved(MouseEvent evt) {}
    public void mouseClicked(MouseEvent evt) {}
    public void mouseReleased(MouseEvent evt) {}
    public void mouseEntered(MouseEvent evt) {}
    public void mouseExited(MouseEvent evt) {}



    public static void main(String[] arguments)
    {
       Image im = Toolkit.getDefaultToolkit().getImage("IconImage.gif");
       Paint f = new Paint();
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setIconImage(im);
       f.setSize(750,550);
       f.setVisible(true);
       f.setResizable(false);

    }


}