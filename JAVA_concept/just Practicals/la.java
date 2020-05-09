//// applet
// import java.awt.*;
// import java.applet.*;

// /* <applet code="la.class" height=400 width=400></applet> */

// public class la extends Applet 
// {
//     public void paint(Graphics g) {
//         g.drawString("hi there",0,20);
//     }
// }

// import java.awt.*;
// import java.applet.*;

// /*  <applet code="la.class" width=200 height=200>
//     <param name="name" value="hmmmm">
//     </applet>*/

// public class la extends Applet {

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

//// exception handling
// class ex extends Exception  {
//     ex() {}

//     void msg() {
//         System.out.println("error msg!");
//     }
// }

// class la extends Exception
// {
//     static void dis() throws ArithmeticException, Exception
//     {
//         if(1>0) throw new ex();
//     }

//     public static void main(String lad[]) 
//     {
//         try {
//             la.dis();
//         }
//         catch(ArithmeticException e) {
//             System.out.println("Something went wrong!");
//         }
//         catch(Exception e) {
//             System.out.println("Somethxvfdxing went wrong!");
//         }
//     }
// }


//// awt
// import java.awt.*;
// import java.awt.event.*;

// class la implements MouseListener
// {
//     Label l1;
//     TextField t1;
//     la()
//     {
//         Frame f = new Frame("this is a frame");
//         f.setSize(400,400);
//         f.setVisible(true);
//         //Container c = f.getContentPane();
//         Panel c = new Panel();

//         t1 = new TextField("enter");
//         l1 = new Label("nothings here!");
//         Button b1 = new Button("enter");

//         c.add(t1);
//         c.add(l1);
//         c.add(b1);

//         f.add(c);

//         b1.addMouseListener(this);
//     }

//     public void mouseClicked(MouseEvent me) {
//         System.out.println("click");

//         String str = t1.getText();

//         l1.setText(str);
//     }

//     public void mouseExited(MouseEvent me) {}
//     public void mouseEntered(MouseEvent me) {}
//     public void mouseReleased(MouseEvent me) {}
//     public void mousePressed(MouseEvent me) {}


//     public static void main(String lad[]) 
//     {
//         new la();
//     }
// }


//// JDBC
// import java.sql.*;

// public class la
// {
//     public static void main(String lad[]) 
//     {
//         Class.forName("com.mysql.jdbc.Driver");

//         Connection c = DriverManager.getConnection("Jdbc:mysql:///demo","root","");

//         Statement st = c.createStatement();
//         String query = "Select * from Student";

//         if(st.execute(query)) {

//         }

//         st.close();
//         c.close();
//     }
// }

//// multi threading

// public class la extends Thread
// {

//     public void run() 
//     {
//         try {
//             for(int i = 0; i <= 4; i++) {
//                 System.out.println(isAlive());
//                 this.sleep(500);

//             }
//         }
//         catch (Exception e) {
            
//         }
//     }

//     public static void main(String lad[]) 
//     {
//         la t = new la();
//         t.start();

//     }
// }


//// serversocket
import java.net.*;
import java.io.*;


public class la 
{
    public static void main(String lad) throws Exception
    {
        ServerSocket ss = new ServerSocket(1800);
        Socket s = ss.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);

        String msg = "";
        do {
            msg = in.readLine();
            System.out.println(msg);
            kb.readLine();
            out.println(msg);
        } while(msg != "bye");

    }
}