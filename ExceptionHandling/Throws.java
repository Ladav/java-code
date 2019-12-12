import java.lang.Exception;
class Throws
{
    public void dis(int a, int b) throws ArithmeticException
    {
        System.out.print(a/b);
    }
    public static void main(String la[]){
        Throws t = new Throws();
        try{
            t.dis(12, 0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}