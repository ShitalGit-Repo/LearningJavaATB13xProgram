package ex_31_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map m1 = new HashMap(20); //order will not be maintained in Hashmap
        m1.put("name", "shital");
        m1.put("rollno", 1);
        m1.put("phone no",12345678);
        System.out.println(m1);

        java.util.Map m2 = new LinkedHashMap(); //order will be maintained in LinkedHashmap
        m2.put("name", "shital");
        m2.put("rollno", 1);
        m2.put("phone no",12345678);
        System.out.println(m2);

        java.util.Map m3 = new TreeMap<>(); //Natural sorting will be done
        m3.put("name", "shital");
        m3.put("rollno", 1);
        m3.put("phone no",12345678);
        System.out.println(m3);

    }
}
