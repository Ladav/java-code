import java.awt.*;
import javax.swing.*;

class demo extends JFrame
{
    demo() 
    {
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setVisible(true);
        setTitle("tables in Swings");
        String data[][] ={{"1", "1", "345"}};
        String colName[] = {"ones", "twos", "threes"};
        JTable t = new JTable(data, colName);
        JScrollPane sp = new JScrollPane(t);
        /*String data[][] = {{"Vinod","BCA","A"},
        {"VIKAS","BCA","B"},
        {"TUSHAR","MCA","A"}};
        String cols[] = {"Name","Course","Grade"};
        JTable table = new JTable(data,cols);
        JScrollPane scrollPane = new JScrollPane(table);
        */
        Container cp = getContentPane();
        cp.add(sp);
    }

    public static void main(String la[])
    {
        demo d = new demo();
    }
}