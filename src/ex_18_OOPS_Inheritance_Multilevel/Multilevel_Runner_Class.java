package ex_18_OOPS_Inheritance_Multilevel;

public class Multilevel_Runner_Class {
    public static void main(String[] args) {

        Grandfather gf = new Grandfather();
        gf.home();
        gf.gf();

        Father f1 = new Father();
        f1.home();
        f1.gf();
        f1.f();

        Son s1 = new Son();
        s1.home();
        s1.gf();
        s1.f();
        s1.s();
        gf.home();

        Grandfather g1 = new Son();  //Dynamic Dispatch
        g1.home();  //it will call son's home s3 if son's home is unavailable (//) it will call father's home.
        g1.gf();

    }
}
