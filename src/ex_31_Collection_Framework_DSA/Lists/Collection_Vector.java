package ex_31_Collection_Framework_DSA.Lists;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Collection_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector(10);

        v.add("pramod");
        v.add("amit");
        v.add("Lucky");
        v.add("piyush");
        System.out.println(v);
        v.remove("piyush");
        System.out.println(v.contains("amit"));
        System.out.println(v);

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
        System.out.println("-----Each Loop");

        for (Object O : v) {
            System.out.println(v);
        }
        System.out.println("-----Iterator");

        Iterator iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----Enumeration");

        Enumeration <Object> enumeration = v.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
