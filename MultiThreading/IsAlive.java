// sleep method put the thread in waiting state for specified milliseconds
import java.lang.*;
import java.util.*;
import java.lang.Thread;

class A extends Thread
{
    public void run()
    {
        for(int i = 0; i < 3; i++){
            System.out.println("A:" + isAlive());
        }
    }
}

class IsAlive
{
    public static void main(String la[])
    {
        A a1 = new A();
        a1.start();
        try{
            a1.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            System.out.println("A:" + a1.isAlive());
    }
}