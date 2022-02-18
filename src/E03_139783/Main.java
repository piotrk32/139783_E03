package E03_139783;

import E03_139783.z1.Reduction;
import E03_139783.z2.Delete;
import E03_139783.z3.FileList;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("z1 \n");
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(1);
        list1.add(2);
        list1.add(1);
        System.out.println("Przed zredukowaniem" + list1);
        Reduction.redukuj(list1, 2);
        System.out.println("Po zredukowaniu" + list1);

        LinkedList<LocalDate> localDateList = new LinkedList<>();
        localDateList.add(LocalDate.of(2022, 02, 18));
        localDateList.add(LocalDate.of(2099, 02, 18));
        localDateList.add(LocalDate.of(2011, 02, 18));
        localDateList.add(LocalDate.of(2054, 02, 18));
        localDateList.add(LocalDate.of(2023, 02, 18));
        localDateList.add(LocalDate.of(2066, 02, 18));
        System.out.println("Przed zredukowaniem" + localDateList);
        Reduction.redukuj(localDateList, 2);
        System.out.println("Po zredukowaniu" + localDateList);
        System.out.println();

        System.out.println("z2 \n");


        LinkedHashSet<Integer> intHashSet = new LinkedHashSet<>();
        intHashSet.add(1);
        intHashSet.add(2);
        intHashSet.add(3);
        intHashSet.add(4);
        intHashSet.add(5);

        Iterator<Integer> iter = intHashSet.iterator();
        Integer counter1= 0;
        while(iter.hasNext())
        {
            if (counter1 == intHashSet.size()-1)
            {
                iter.remove();
            }
            iter.next();
            counter1++;
        }
        System.out.println(intHashSet);

        LinkedHashSet<String> strHashSet = new LinkedHashSet<>();
        strHashSet.add("Witam");
        strHashSet.add("qwe");
        strHashSet.add("dasdas");
        strHashSet.add("eqwe");
        strHashSet.add("cos");

        Iterator<String> iter2 = strHashSet.iterator();
        Integer counter2 = 0;
        while(iter2.hasNext())
        {
            if (counter2 == strHashSet.size()-1)
            {
                iter2.remove();
            }
            iter2.next();
            counter2++;
        }
        System.out.println(strHashSet);

        LinkedHashSet<LocalDate> dateHashSet = new LinkedHashSet<>();
        dateHashSet.add(LocalDate.of(2000,10,10));
        dateHashSet.add(LocalDate.of(2001,10,10));
        dateHashSet.add(LocalDate.of(2002,10,10));
        dateHashSet.add(LocalDate.of(2003,11,11));
        dateHashSet.add(LocalDate.of(2004,10,10));

        Iterator<LocalDate> iter3 = dateHashSet.iterator();
        Integer counter3 = 0;
        while(iter3.hasNext())
        {
            if (counter3 == strHashSet.size()-1)
            {
                iter3.remove();
            }
            iter3.next();
            counter3++;
        }
        System.out.println(dateHashSet);






        System.out.println("z3 \n");

        FileList.FileListNoExtenction("C:\\Users\\Ja\\IdeaProjects\\E03_139783\\src\\E03_139783\\z3");

    }
}
