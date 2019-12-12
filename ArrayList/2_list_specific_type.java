import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

class listPrimitive
{
    public static void main(String la[])
   {
       List<Object> myList = new ArrayList<Object>();
       List<Integer> inList = new ArrayList<>();

       inList.add(4);
       inList.add(6);

       myList.add(193018);
       myList.add("davinder");
       myList.addAll(2, inList);

       for (Object item : myList)
            System.out.println(item);

       myList.remove(2);
       Iterator i = myList.iterator();
       while(i.hasNext())
       {
           System.out.println(i.next());
       }


   } 
}