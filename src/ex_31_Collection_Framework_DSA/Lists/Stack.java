package ex_31_Collection_Framework_DSA.Lists;

public class Stack {

//will be rarely use in automation

    public static void main(String[] args) {
        java.util.Stack s1 = new java.util.Stack();
        s1.add("python");
        s1.add("c#");
        s1.add("Java");
        System.out.println(s1);          //will print the list
        System.out.println(s1.peek());   //will print the top element.
        System.out.println(s1.pop());    //will remove the element which is on top.
        System.out.println(s1);

    }
}
