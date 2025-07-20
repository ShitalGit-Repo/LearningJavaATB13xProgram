package ex_22_Abstraction_Interface;

public class Lab004_Abstraction_Interface {
    public static void main(String[] args) {

    }
}
//Variable in case of abstract are not final and value can be changed.
//we can create constructor in abstract class
abstract class Incomplete_abstract {
    int a = 10;
    abstract void display1 ();
    void display2 () {
        System.out.println("Print");
    }
}
//Variable in case of interface are final and value cannot be changed.
//we cannot create constructor in interface
interface Incomplete_interface {
    int a = 10;  //final value can't be changed.
    void display();
    default void display2(){
        System.out.println("Default is allowed");
    }
    static void display3(){
        System.out.println("static is allowed");
    }
}