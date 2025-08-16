package ex_31_Collection_Framework_DSA.Map;

import java.util.Map;
import java.util.TreeMap;

public class Map_TreeMap {
    public static void main(String[] args) {

        Map <String, Integer > values = new TreeMap<>();
        values.put("Second", 2);
        values.put("First", 1);
        values.put("Third", 3);
        System.out.println("TreeMap (sorted by keys) : " + values);
        values.replace("First", 11);
        System.out.println(values);

    }
}
