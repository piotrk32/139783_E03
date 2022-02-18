package E03_139783.z2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Delete
{
    public static <E, I extends Iterable<E>> void removeBeforeLast(LinkedHashSet set){
        Iterator<E> iter = set.iterator();
        Integer counter=0;
        while(iter.hasNext()) {
            if (counter == set.size() - 1) {
                iter.remove();
            }
            iter.next();
            counter++;
        }
    }
}
