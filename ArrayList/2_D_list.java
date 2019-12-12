import java.util.ArrayList;

class List2D
{
    public static void main(String la[])
    {
        ArrayList<ArrayList<Object>> my = new ArrayList<>();

        for(int i = 0; i < 2; i++)
            my.add(new ArrayList<>());
        
        my.get(0).add(0);
        my.get(0).add(1);
        my.get(0).add(2);
        my.get(1).add(0);
        my.get(1).add(1);
        my.get(1).add(2);

        for(int i = 0; i < my.size(); i++)
            for(int j = 0; j < my.get(i).size(); j++)
                System.out.print(my.get(i).get(j));
    }
}