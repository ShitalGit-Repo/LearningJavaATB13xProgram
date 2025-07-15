package ex_023_static;

public class Static_IIB {
    public static void main(String[] args) {
        A ref1 = new A(10);
        A ref2 = new A(11);

        System.out.println(A.b);    //can access b directly with the help of A
        System.out.println(ref1.a);
        System.out.println(ref2.a);

        System.out.println(ref1.b);   //value will be same
        System.out.println(ref2.b);   //value will be same

        ref1.displayvalue();       //will call value 10
        ref2.displayvalue();       //will call value 11

        A.staticmethod();         //you can call static method directly

    }

}
class A {
    int a;
    static int b = 20;  //shared between object

    A (int a){
        this.a = a;
    }
    void displayvalue (){
        System.out.println(this.a);
        System.out.println(b);      //static variable are accessible in instance block
    }
    static void staticmethod(){   //static method
        System.out.println("Static method will be called when class is loaded");
//      System.out.println(this.a);  //static method cannot access non-static or instance variables

    }

}