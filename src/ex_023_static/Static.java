package ex_023_static;

public class Static {

}
class B {
    static {
        System.out.println("Static block - which is loaded when class loads");
    }
    int a = 10;
    static int b = 10;

    void display (){            //non static block
        System.out.println(b);  //can access static variable
        System.out.println("Non-static function");
    }
    static void commonToAll () {
//      System.out.println(a); //cannot access a which is a non-static variable.
        System.out.println("Static function");
    }
    static class c { //never used in automation
    }
}