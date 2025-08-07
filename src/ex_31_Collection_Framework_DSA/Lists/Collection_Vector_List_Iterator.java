package ex_31_Collection_Framework_DSA.Lists;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Collection_Vector_List_Iterator {
    public static void main(String[] args) {
        Vector <String> vector = new Vector<>();
        vector.add("Item 1");
        vector.add("Item 2");
        vector.add("Item 3");
        vector.add("Item 4");
        vector.add("Item 5");

        ListIterator listitertor = vector.listIterator();
        while (listitertor.hasNext()){
            System.out.println(listitertor.next());
        }
        while(listitertor.hasPrevious()){
            System.out.println(listitertor.previous());
        }
        System.out.println("-----");

        Iterator iterator = vector.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
