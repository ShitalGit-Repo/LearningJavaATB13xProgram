package ex_31_Collection_Framework_DSA.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_with_LinkedList {
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(6);
        queue.add(2);

        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}
