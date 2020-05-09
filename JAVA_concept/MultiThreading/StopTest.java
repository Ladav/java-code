// sleep method put the thread in waiting state for specified milliseconds
import java.lang.*;
import java.util.*;
import java.lang.Thread;

class Test extends Thread
{
    public void run()
    {
        for(int i = 0; i < 3; i++){
            System.out.println(i);
            if(i==1) stop();
        }
    }
}
class StopTest
{
    public static void main(String la[])
    {
        Test t1 = new Test();
        t1.start();
    }
}