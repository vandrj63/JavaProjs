// JSlider Example
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class SwingSlider extends JFrame implements ChangeListener
{
  JLabel aLabel = new JLabel("Slider value:");
  JTextField sliderValue = new JTextField(5);

  // creat a horizontal slider
  public SwingSlider()
  {
     setTitle("JSlider Demo");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     Container con = getContentPane();
     con.setLayout(new BorderLayout());
  JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25); //start, end, inital value
  slider.setMinorTickSpacing(2);
  slider.setMajorTickSpacing(10);
  slider.setPaintTicks(true);
  slider.setPaintLabels(true);
  
  //use the standard numeric labels
  slider.setLabelTable(slider.createStandardLabels(10));
 
  slider.addChangeListener(this);
  //add slider to the North
  con.add(slider, BorderLayout.NORTH);

  //create vertical slider
  JSlider slider2 = new JSlider(JSlider.VERTICAL, 0, 3, 3); //start, end, inital value
  slider2.setMinorTickSpacing(1);
  slider2.setMajorTickSpacing(1);
  slider2.setPaintTicks(true);
  slider2.setPaintLabels(true);
  slider2.setSnapToTicks(true);
  slider2.addChangeListener(this);
  con.add(slider2, BorderLayout.WEST);
  
  JPanel center = new JPanel(new FlowLayout());
  center.add(aLabel);
  center.add(sliderValue);
  sliderValue.setText("" + slider.getValue());
  con.add(center, BorderLayout.CENTER);
}

public void stateChanged(ChangeEvent evt)
{
  JSlider source = (JSlider)evt.getSource();
  if(!source.getValueIsAdjusting())
  {
     int value = source.getValue();
     sliderValue.setText("" + value);
  }
}

public static void main(String[] args)
{
  SwingSlider frame = new SwingSlider();
  frame.setVisible(true);
}
}