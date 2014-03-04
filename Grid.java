import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JDemoGridLayout extends JFrame
{
     private JButton b1 = new JButton("Button 1");
     private JButton b2 = new JButton("Button 2");
     private JButton b3 = new JButton("Button 3");
     private JButton b4 = new JButton("Button 4");
     private JButton b5 = new JButton("Button 5");
     private Container con = getContentPane();
     private GridLayout layout = new GridLayout(3, 2, 5, 5);
     
     public JDemoGridLayout()
     {
          super("GridLayout");
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          con.setLayout(layout);
          con.add(b1);
          con.add(b2);
          con.add(b3);
          con.add(b4);
          con.add(b5);
     }

     public static void main(String[] args)
     {
	  JDemoGridLayout aFrame = new JDemoGridLayout();
   	  aFrame.setSize(450,225);  
    	  aFrame.setVisible(true);
     }

}

