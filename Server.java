import java.io.*;
import java.net.*;

class Server 
{
    public static void main(String la[]) throws Exception {
        ServerSocket ss = new ServerSocket(1800);
        Socket s = ss.accept();
        BufferedReader si = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader i = new BufferedReader(new InputStreamReader(s.getInputStream()));

        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        String  msg = "";
        do {
            msg = i.readLine();
            System.out.println(msg);
            msg = si.readLine();
            out.println(msg);
        }
        while(!msg.equals("bye"));
    }
}


/*
import java.net.*;
import java.io.*;
class Server
{ public static void main(String args[]) throws Exception
{
ServerSocket ss=new ServerSocket(1800);
Socket s=ss.accept();
BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
PrintWriter out=new PrintWriter(s.getOutputStream(),true);
String msg="";
do
{
msg=in.readLine();
System.out.println(msg);
msg=kb.readLine();
out.println(msg);
}
while(!msg.equals("bye"));
}
}
*/
