package ex_31_Collection_Framework_DSA.Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet {
    public static void main(String[] args) {
        Set hs = new java.util.HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("shital");
        hs.add("awachar");
        hs.add("awachar");   //will ignore duplicate elements
        System.out.println(hs);
    }
}
