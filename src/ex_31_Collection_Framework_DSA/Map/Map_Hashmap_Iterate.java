package ex_31_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.Map;

public class Map_Hashmap_Iterate {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("id1", 1);
        map.put("id2", 2);
        map.put("id3", 34);
        map.put("id5", null);
        map.put("id6", null);
        map.put(null, 100);

        System.out.println(map);
        System.out.println(map.size());

        for (Map.Entry<String, Integer> item : map.entrySet()){
            System.out.println(item.getKey() + " -> " + item.getValue());
        }

    }
}
