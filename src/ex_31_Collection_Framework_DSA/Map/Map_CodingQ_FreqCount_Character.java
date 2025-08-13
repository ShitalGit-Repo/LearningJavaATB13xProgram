package ex_31_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.Map;

public class Map_CodingQ_FreqCount_Character {
    public static void main(String[] args) {
        String input = "programming";

        Map <Character, Integer> freqMap = new HashMap<>();
        for (char c : input.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        System.out.println(freqMap);
    }
}
