package ex_31_Collection_Framework_DSA.Map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Map_HashTable {
    public static void main(String[] args) {

//HashTable - synchronised, slow, legacy class and thread safe.
        Hashtable <Integer,String> ht1 = new Hashtable<>();
        ht1.put(1, "One");
        ht1.put(1, "One");  //will ignore duplicate.
        ht1.put(2, "Two");
        ht1.put(3, "Three");
//      ht1.put(4, null);       //exception error
//      ht1.put(null,"Five");   //not allowed
        System.out.println(ht1);

        HashMap <Integer,String> ht2 = new HashMap<>();
        ht2.put(1, "One");
        ht2.put(1, "One");  //Will ignore duplicate
        ht2.put(2, "Two");
        ht2.put(3, "Three");
        ht2.put(4,null);
        ht2.put(null,"Five"); //here null = five
        ht2.put(null, null);  //will consider latest value so null = null
        System.out.println(ht2);

        Enumeration <Integer> e = ht1.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
