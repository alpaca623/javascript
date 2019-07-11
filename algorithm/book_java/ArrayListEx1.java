package algorithm.book_java;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();
        list1.add(new Integer(5));
        list1.add(new Integer(13));
        list1.add(new Integer(1));
        list1.add(new Integer(53));
        list1.add(new Integer(25));
        list1.add(new Integer(9));

        System.out.println((list1));

        ArrayList list2 = new ArrayList(list1.subList(1,4));


        Collections.sort(list1);

        System.out.println(list1);

        list2.add("B");
        list2.add("C");
        list2.add("AA");
        list2.add(3,"A");
        list2.add(3,"AAA");

        System.out.println(list2);

        list1.retainAll(list2);

        System.out.println(list1);

        for(int i = list2.size()-1; i>=0; i--){
            if(list1.contains(list2.get(i))){
                list2.remove(i);
            }
        }

        System.out.printf(list1+" " +list2);
    }
}
