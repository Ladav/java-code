import java.awt.Graphics;
import java.awt.*;
import java.applet.Applet;
import java.applet.*;

/*<applet code="drawPoly.class" width="400" height="600"></applet>*/

public class drawPoly extends Applet 
{
    public void init() {
        setBackground(Color.red);
    }
    public void paint(Graphics g) {
        int a[] = {20, 200, 100, 20};
        int b[] = {20, 100, 200, 20};
        int no = 4;
        g.drawPolygon(a, b, no);
        g.drawString("Hi There!",50,50);
    }
}