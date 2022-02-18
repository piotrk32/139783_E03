package E03_139783.z1;

import java.util.LinkedList;

public class Reduction
{
    public static void redukuj (LinkedList<?> list, Integer n)
    {

        for (int i = list.size()-1; i>=0; i--)
        {
            if(i%n ==1)
            {
                list.remove(i);
            }

        }


    }
}
