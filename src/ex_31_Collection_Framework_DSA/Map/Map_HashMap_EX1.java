package ex_31_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.Map;

public class Map_HashMap_EX1 {
    public static void main(String[] args) {
        Map <String, Integer> vehicles = new HashMap<>();
        vehicles.put("MG Astor", 1);
        vehicles.put("i10", 2);
        vehicles.put("Honda", 1);
        vehicles.put("BMW", 2);
        vehicles.put("Tesla", 5);
//      vehicles.put(123,"Safari"); will not take the value.
        System.out.println("Total Vehicles : " + vehicles.size());

//      Iterator over the Map
        for (String key : vehicles.keySet()){
           // System.out.println("Keys " + key);
            System.out.println(key + " -> " + vehicles.get(key));
        }
//check if key exist
        if (vehicles.containsKey("Audi")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
//Clearing the Map
        vehicles.clear();
        System.out.println("After clearing operation, size : "+vehicles.size());


    }
}
