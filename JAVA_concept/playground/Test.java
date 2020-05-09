import java.awt.*;
import java.applet.*;

// <applet code="Test.class" height=100 width=300></applet>

public class Test extends Applet implements Runnable {
    Thread t;
    int x = 0;
    int flag = 1;
    public void init() {
        t = new Thread(this);
        t.start();
    }
    public void run() {
        while(true) {
            x = x + 10 * flag; 
            if (x > 240) 
                flag = -1; 
            if (x < 0) 
                flag = 1; 

            repaint();
            try {
                Thread.sleep(200);
            } catch(Exception e) {}
        }
    }
    public void paint(Graphics g) {
        g.drawString("Welcome", x, 50);
    }
}