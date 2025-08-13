package ex_31_Collection_Framework_DSA.Set;

import java.util.*;
import java.util.HashSet;

public class HS_LHS_TS {
    public static void main(String[] args) {
//HAST SET
        Set <String> hs = new HashSet();  //no order, no duplicate, element with same data type.
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        hs.add(null);
//      hs.add(null);          only one null is allowed.
//      hs.add(123);           same data type is allowed.
        System.out.println(hs);
// for loop
        for (String s : hs){
            System.out.println(s);
        }
//iterator
        Iterator iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//LINKED HASHSET
        Set lhs = new LinkedHashSet();  //order maintain but no duplicate
        lhs.add("Apple");
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));

//TREE SET - BLACK AND WHITE TREE
        Set ts = new TreeSet(); //maintain order, natural sorting based on ASCII value
        ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("Watermelon");
//      ts.add(123);       //element with same data type are allowed
//      ts.add(null);      //null is not allowed as it can't be sorted.
        System.out.println(ts);
        System.out.println("------For Each-----");

        for (Object o : ts){
            System.out.println(o);
        }

    }
}
