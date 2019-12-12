// sleep method put the thread in waiting state for specified milliseconds
import java.lang.*;
import java.util.*;

class Test
{   
    int c=0;
    //synchronized public void inc()
    public void inc()
    {
        //synchronized(this)
        {
            c++;
        }
    }
}
class Sync
{
    public static void main(String la[])
    {
        Test t1 = new Test();
        Thread a1 = new Thread(new Runnable(){
            public void run() {
                for(int i = 0; i < 10000; i++)
                    t1.inc();
                }
            });
        Thread a2 = new Thread(new Runnable(){
            public void run() {
                for(int i = 0; i < 10000; i++)
                    t1.inc();
                }
            });

        a1.start();
        a2.start();
        try{
        a1.join();
        a2.join();
        }
        catch(Exception e){}
        System.out.print(t1.c);
    }
}