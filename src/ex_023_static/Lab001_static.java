package ex_023_static;

public class Lab001_static {
    public static void main(String[] args) {

//Static - means common, shared to everyone
        P p1 = new P();    //as soon as P is created it will call static block first
        P p2 = new P();
        System.out.println(P.a); //we can access the variable directly  y class without creating reference.
        p1.a = 12;  //value of a will be change to 12 for all as p1 & p2 are directing the same value.
        System.out.println(P.a);  //12
        System.out.println(p1.a); //12
        System.out.println(p2.a); //12

        p1.b = 23;
        p2.b = 24;
        System.out.println(p1.b);
        System.out.println(p2.b);

    }
}
class P{
    static int a = 10;
    int b = 10;

    static {      //static block
        System.out.println("Static block - which is loaded automatically when class is loaded");
    }
}

