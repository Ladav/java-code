// sleep method put the thread in waiting state for specified milliseconds
import java.lang.*;
import java.util.*;
import java.lang.Thread;

class A extends Thread
{
    public void run()
    {
        for(int i = 0; i < 3; i++){
            System.out.println("A:" + i);
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i = 0; i < 3; i++){
            Yeild();
            
            System.out.println("B:" + i);
        }
    }
}
class YeildTest
{
    public static void main(String la[])
    {
        A a1 = new A();
        B b1 = new B();
        a1.setPriority(7);
        b1.setPriority(2);
        b1.start();
        a1.start();
    }
}