import java.awt.*;
import javax.swing.*;

class demo extends JFrame
{
    demo() 
    {
        Container cp = getContentPane();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setVisible(true);
        setTitle("this is the end.");
        JPanel p = new JPanel(new GridLayout(4,2));

        for(int i = 1; i <= 4; i++) {
            p.add(new JLabel("label :" + i));
            p.add(new JTextField("this is " + i + " end."));
        }
        cp.add(p);
    }

    public static void main(String la[])
    {
        demo d = new demo();
    }
}