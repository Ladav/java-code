// import java.lang.Thread;

// class th implements Runnable {

//     demo d = new demo();
//     public void run() {
//         for(int i = 0; i <=5000 ; i++ ) {
//             d.fun();
//         }
//     }
// }

// class th1 extends Thread {
//     demo d = new demo();
//     public void run() {
//         for(int i = 0; i <=5000 ; i++ ) {
//             d.fun();
//         }
//     }
// }

// class demo
// {
//     public static int c = 0;

//     public void fun() {
//         c++;
//         System.out.println(c);
//     }

//     public static void main(String la[] ) {
//         th t = new th();
//         new Thread(t).start();
//         new th1().start();

//     }
// }
// import java.lang.*;
// import java.util.*;
// import java.awt.*;
// import java.applet.*;

// /*<applet code="demo.class" width=200 height=200></applet>*/

// public class demo extends Applet {

//     String name = "Asd";
//     Double salary = 32453.43;

//     public void init() {
//         name = getParameter("name");
//         //salary = Double.parseDouble(getParameter("salary"));
//     }

//     public void paint(Graphics g) {
//             g.drawString("weclome " + name ,10,100);
//             g.drawString("salary :" + salary, 10,120);
//     }
// }

// import java.awt.*;
// import javax.swing.*;
///// rotate
// class demo extends JPanel {
//     public void paintComponent(Graphics g) {
//         Graphics2D g2d = (Graphics2D)g;
//         g2d.rotate(Math.PI/3);
//         g2d.fillRect(100, -100, 100, 100);
//     }

//     public static void main(String la[]) {
//         JFrame frame = new JFrame("painting");
//         frame.add(new demo());
//         frame.setVisible(true);
//         frame.setSize(300, 300);
//     }
// }


///// scaling and Translating

// import java.awt.*;
// import javax.swing.*;
// import java.awt.geom.AffineTransform;

// class Test extends JPanel {
//     public void paintComponent(Graphics g) {
//         Graphics2D g2d = (Graphics2D) g;
//         // Creating AffineTransform with both Trasformations then setting transform
//         AffineTransform af = new AffineTransform();
//         af.scale(1.5, 1.2); // or directly g2d.scale without usung AffineTransform
//         af.translate(90, 90);
//         g2d.setTransform(af);
//         g2d.fillRect(50, 50, 100, 100);
//     }

//     public static void main(String args[]) {
//         JFrame frame = new JFrame("Painting");
//         frame.add(new Test());
//         frame.setVisible(true);
//         frame.setSize(600, 600);
//     }
// }

//// shearing 
// import javax.swing.*;
// import java.awt.*;
// import java.awt.geom.AffineTransform;

// class demo extends JPanel {
//     public void paintComponent(Graphics g) {
//         Graphics2D g2d = (Graphics2D) g;
//         g2d.fillRect(200, 200, 100, 100);
//         g2d.shear(0,0.5);
//         g2d.fillRect(100,100,50,50);
//     }

//     public static void main(String la[]) {
//         JFrame f = new JFrame("shearing");
//         f.add(new demo());
//         f.setSize(400,400);
//         f.setVisible(true);
//     }
// }


///// MenuBar->Menu->MenuItem


// import java.awt.*;
// import javax.swing.*;

// class demo extends JFrame 
// {
//     demo() {
//         setSize(400,400); 
//         setVisible(true);

//         MenuBar mb = new MenuBar();
//         Menu menu = new Menu("file");
//         Menu subMenu = new Menu("open");
//         MenuItem mi = new MenuItem("open");

//         setMenuBar(mb);
//         mb.add(menu);
//         menu.add(subMenu);
//         subMenu.add(mi);
//         subMenu.add(new MenuItem("close"));
//         subMenu.add(new MenuItem("exit"));
//     }

//     public static void main(String la[]) {
//         new demo();
//     }
// }




///// PopupMenu

// import java.awt.*;
// import java.awt.event.*;
// import java.applet.*;
// import java.applet.Applet;

// public class demo extends Frame  
// {
//     PopupMenu pm;

//      demo() {
//         setVisible(true);
//         setSize(400, 400);
//         PopupMenu pm = new PopupMenu();
        
//         pm.add(new MenuItem("open"));
//         pm.add(new MenuItem("save"));
//         pm.add(new MenuItem("close"));
//         pm.addSeparator();
//         pm.add(new MenuItem("exit"));

//         add(pm);
//         pm.show(this, 50, 50);
//     }
//     public static void main(String args[]) {
//         new demo();
//     }
// }

//// previous year question
// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;

// class demo extends Frame {

//     demo() {
//         setSize(400, 400);
//         setVisible(true);

//         PopupMenu pm = new PopupMenu();
//         pm.add(new MenuItem("hi"));
//         pm.addSeparator();

//         String str = JOptionPane.showInputDialog("enter your name:");
        
//         pm.add(new MenuItem(str));

//         add(pm);
//         pm.show(this, 50, 50);
//     }

//     public static void main(String args[]) {
//         new demo();
//     }
// }


//// border layout

// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;
// import java.applet.*;

// public class demo extends Applet {

//     public demo() {
//         setSize(400, 400);
//         setVisible(true);

//         setLayout(new BorderLayout());

//         Button b[] = new Button[5];

//         for(int i = 0; i < 5; i++) {
//             b[i] = new Button("SET " +i);
//         }

//         add(b[0], BorderLayout.NORTH);
//         add(b[1], BorderLayout.SOUTH);
//         add(b[2], BorderLayout.EAST);
//         add(b[3], BorderLayout.WEST);
//         add(b[4], BorderLayout.CENTER);

//     }
// }


///// grid layout

// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;
// import java.applet.*;

// public class demo extends Applet {

//     public demo() {
//         setSize(400, 400);
//         setVisible(true);

//         setLayout(new GridLayout(3, 2));

//         for(int i = 0; i < 5; i++) {
//             add(new Button("SET " +i));
//         }
//     }
// }


//// flow layout

// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;
// import java.applet.*;

// public class demo extends Applet {

//     public demo() {
//         setSize(400, 400);
//         setVisible(true);

//         setLayout(new FlowLayout());

//         for(int i = 0; i < 5; i++) {
//             add(new Button("SET " +i));
//         }
//     }
// }

////// gridbag layout
// import java.awt.*;
// import javax.swing.*;

// class Test extends Frame {
//     Test() {
//         setVisible(true);
//         setSize(200, 200);
//         Panel p = new Panel();
//         GridBagLayout g = new GridBagLayout();
//         GridBagConstraints gc = new GridBagConstraints();
//         gc.weightx = 1;        
//         gc.weighty = 1;
//         p.setLayout(g);
//         Button one = new Button("One");
//         Button two = new Button("Two");
//         add(p);
//         g.setConstraints(one, gc);
//         g.setConstraints(two, gc);
//         p.add(one);
//         p.add(two);
//     }

//     public static void main(String args[]) {
//         new Test();
//     }
// }




/////// JDBC

// import java.sql.*;  // 1 load sql pack

// public class demo 
// {
//     public static void main(String la[]) throws Exception
//     {
//         //2 load driver
//         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

//         // 3 connection
//         Connection c = DriverManager.getConnection(,,);

//         // 4 create Statement
//         Statement s = c.createStatement();

//         // 5 execute statement
//         s.execute("insert into emp values(1,'jkfas',23)");

//         // 6 close connection
//         c.close();

//     }
// }


///// mouse event 

// import java.awt.*;
// import javax.swing.*;
// import java.awt.event.*;

// class demo extends JFrame implements MouseMotionListener
// {
//     demo() 
//     {
//         setSize(600,400);
//         setVisible(true);
//         addMouseMotionListener(this);
//     } 
//     public void mouseMoved(MouseEvent me) {
//             setBackground(Color.red);
//             System.out.println("red");
//     }
//     public void mouseDragged(MouseEvent me) {
//         setBackground(Color.blue);
//         System.out.println("blue");

// }
//     public static void main(String la[])
//     {
//         new demo();
//     }
// }



//// key events

// import java.awt.*;
// import javax.swing.*;
// import java.awt.event.*;
// import java.applet.*;

// class demo extends JFrame implements KeyListener
// {
//     Label l = new Label("");
//     demo() {
//         setSize(600,400);
//         setVisible(true);
//         Container c = getContentPane();
        
//         c.add(l);
//         addKeyListener(this);
        
//     }

//     public void keyPressed(KeyEvent ke) {
//         System.out.println("key pressed");
//         l.setText("key Pressed");
//     }
//     public void keyReleased(KeyEvent ke) {
//         System.out.println("key Released");
//     }
//     public void keyTyped(KeyEvent ke) {
//         System.out.println("key Typed");
//     }

//     public static void main(String la[]) {
//         new demo();
//     }
// }
///// 5. Write a code snippet to implement an applet displaying a welcome message running from
///// right to left over the applet-viewer window. (10)

// import java.awt.*;
// import javax.swing.*;
// import java.applet.*;
// public class demo extends Applet implements Runnable
// {
//     Thread t;
//     int x = 0;
//     int y = 100;
//     public demo() {
//         t = new Thread(this);
//         t.start();
//     }
//     public void run() {
//         for(int i = 0; i <= 200; i++) {
//             x++;
//             repaint();
            
//             try{
//                 t.sleep(200);
//             }
//             catch(Exception e) {
//                 System.out.println("something went wrong");
//             }
//         }
//     }

//     public void paint(Graphics g) {
//         Graphics2D g2d = (Graphics2D)g;
//         g2d.drawString("welcome", x, y);
//     }
// }

// 
// import java.lang.*;
// class demo {
//     public static void main(String la[]) {
//         Integer a = new Integer(33);
//         a=20;
//         System.out.println(a);
//     }
// }

import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.geom.AffineTransform;

public class demo extends JPanel
{
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;

        AffineTransform af = new AffineTransform();
        
        g2d.shear(0, 0.5);
        g2d.fillRect(100,100,100,100);
    }

    public static void main(String la[]) {
        JFrame f = new JFrame();
        f.add(new demo());
        f.setVisible(true);
        f.setSize(400,400);
    }
}

import java.io.*;
import javax.servlet.*;

class demo implements Servlet {
    public void init() throws IOException {

    }

    public void  service(ServletRequest req, ServletResponse res) throws IOException, ServletException{

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        out.println("<h1> Hello </h1>");
    }

    public void destroy() {

    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public String getServletInfo() {
        return "some";
    }
}