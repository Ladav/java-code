import java.awt.*;
import javax.swing.*;

class demo extends JFrame
{
    demo() {
        Container cp = getContentPane();
        Panel p = new Panel(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
        Label l1 = new Label("this is the end.");
        
        cp.add(p);
        p.add(l1,BorderLayout.SOUTH);
        
    }

    public static void main(String la[])
    {
        demo d = new demo();
    }
}