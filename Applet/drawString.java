import java.awt.Graphics;
import java.awt.*;
import java.applet.Applet;
import java.applet.*;

/*<applet code="drawString.class" width="400" height="600"></applet>*/

public class drawString extends Applet 
{
    public void init() {
        setBackground(Color.red);
    }
    public void paint(Graphics g) {
        g.drawString("Hi There!",50,50);
    }
}