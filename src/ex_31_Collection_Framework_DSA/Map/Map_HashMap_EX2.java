package ex_31_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.Map;

public class Map_HashMap_EX2 {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("id",1);
        map.put("id",2);  //it will take latest id of id that is 2.
        map.put("id2",2);
        map.put("id3", 34); //duplicate values are allowed
        map.put("id6", 34);
        map.put("id4",null); //multiple null values are allowed
        map.put("id5",null);
        map.put(null,102);    //1 null key is allowed
        map.put(null,103);  //multiple null key is not allowed it will be overwritten

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id3"));
        System.out.println(map.remove("id3"));
        System.out.println(map);
    }
}
