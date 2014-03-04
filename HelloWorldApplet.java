import java.applet.*;
import java.awt.*;
/**
* The HelloWorldApplet class implements an applet that
* simply displays "Hello World!".
*/
public class HelloWorldApplet extends Applet {
public void paint(Graphics g) {
// Display "Hello World!"
g.drawString("Hello world!", 50, 25);
}
}