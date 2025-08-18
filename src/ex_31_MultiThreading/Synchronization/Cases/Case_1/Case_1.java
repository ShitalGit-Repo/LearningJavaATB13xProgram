package ex_31_MultiThreading.Synchronization.Cases.Case_1;

public class Case_1 {
    public static void main(String[] args) {
        Sync s1 = new Sync();
        Sync s2 = new Sync();
        A ta = new A(s1, "A");
        ta.start();
        B tb = new B(s2, "B");
        tb.start();

    }
}
//Class A will call m1 method and class B will call m2 method.
class A extends Thread {
    Sync s ;
    public A (Sync s, String tname){
        super(tname);
        this.s = s;
    }
    public void run () {s.m1();}
}
class B extends Thread {
    Sync s ;
    public B (Sync s, String tname){
        super(tname);
        this.s = s;
    }
    public void run () {s.m1();}
}

class Sync {
    void m1(){
      Thread th = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println(th.getName() + "- m1 -" + i);
        }try{
            Thread.sleep(1000);
        }catch (Exception ex){
        }
    }
    void m2(){
        Thread th = Thread.currentThread();
        for (int i = 101; i < 105; i++) {
            System.out.println(th.getName() + "- m2 -" + i);
        }try{
            Thread.sleep(1000);
        }catch (Exception ex){
        }
    }
}
