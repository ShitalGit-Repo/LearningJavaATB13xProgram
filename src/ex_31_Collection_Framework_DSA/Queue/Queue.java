package ex_31_Collection_Framework_DSA.Queue;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add("Shital");
        q.add("Awachar");
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
