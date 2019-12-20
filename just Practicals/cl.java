import java.net.*;
import java.io.*;


public class cl 
{
    public static void main(String args[]) throws Exception
    {
        Socket s=new Socket("localhost",1800);

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        String msg = "";

        do {
            msg = kb.readLine();
            out.println(msg);
            msg = in.readLine();
            System.out.println(msg);
        } while(msg != "bye");
    }
}