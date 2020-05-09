//displaying the list of generic type And the use of Object(the godfather) Class
import java.util.*;
import java.util.List;
import java.util.ArrayList;

class list
{
    public static void main(String la[])
    {
        List myList = new ArrayList();

        myList.add("Davinder Singh");
        myList.add("mca 2nd");
        myList.add(193018);

        for(Object x : myList)
        {
            System.out.println(x);
        }

        for(int i = 0; i < myList.size(); i++)
        {
            System.out.println(myList.get(i));
        }

        Iterator it = myList.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}