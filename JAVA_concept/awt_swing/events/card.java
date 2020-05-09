import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class card extends JFrame implements ActionListener
{
    CardLayout cl;
    JButton b1, b2;
    Container c;

    card() {
        c = getContentPane();
        cl = new CardLayout(40,30);
        c.setLayout(cl);
        b1 = new JButton("apple");
        b2 = new JButton("mango");
        b1.addActionListener(this);
        b2.addActionListener(this);
        c.add("a",b1);
        c.add("b",b2);
    }

    public void actionPerformed(ActionEvent e) {
        cl.next(c);
    }

    public static void main(String la[]) {
        card car = new card();
        car.setVisible(true);
        car.setSize(400,400);
        car.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
        
}