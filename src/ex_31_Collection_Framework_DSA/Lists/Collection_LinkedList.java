package ex_31_Collection_Framework_DSA.Lists;

import java.util.LinkedList;
import java.util.List;

public class Collection_LinkedList {
//Linked list is fast comapre to arraylst for insert or delete element
//takes more memory, element accessing is slow
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
    }
}
