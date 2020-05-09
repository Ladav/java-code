import java.lang.*;
class myclass
{
    public static void main(String la[]){
        int age = 12;
        try{
            if(age >= 18) {
                System.out.println("damn cool");
            }
            else{
                throw new Exception("this is not working");
            }
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}
