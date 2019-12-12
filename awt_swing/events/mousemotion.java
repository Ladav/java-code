import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class demo extends JFrame implements MouseMotionListener
{
    demo() 
    {
        setSize(600,400);
        setVisible(true);
        addMouseMotionListener(this);
    } 
    public void mouseMoved(MouseEvent me) {
            setBackground(Color.red);
            System.out.println("red");
    }
    public void mouseDragged(MouseEvent me) {
        setBackground(Color.blue);
        System.out.println("blue");

}
    public static void main(String la[])
    {
        new demo();
    }
}