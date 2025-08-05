package ex_31_Collection_Framework_DSA.Lists;

import java.util.ArrayList;
import java.util.List;

public class Collection_ArrayList {
    public static void main(String[] args) {
        Integer [] arr = new Integer[10]; //array - fixd size, elements with same data type, can't be extended automatically,less element causes memory wastage.
        arr[0]=10;

        List l = new ArrayList(); //list-flexible size, by default is 10
        l.add("hello");           //can store elements with different data types
        l.add(123);               //can be extended automatically
        l.add("hello");           //duplicate is allowed.
        l.add(2.34);
        l.add(true);
        l.add("hello");
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains(1));
        System.out.println(l.indexOf(true));
        System.out.println(l.indexOf("hello")); //return the first occurrence of specified element

        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        for (Object o : l) {
            System.out.println(o);
        }
        l.set(0 ,"Hello");
        System.out.println(l);

        l.clear();
        System.out.println(l);
    }

}
