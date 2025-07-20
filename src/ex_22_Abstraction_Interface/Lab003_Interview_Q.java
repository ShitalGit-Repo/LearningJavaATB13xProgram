package ex_22_Abstraction_Interface;

public class Lab003_Interview_Q {
}
interface I11 {}                                 //Valid
interface I12 {}
class A1 {}                                      //Valid
class B1 {}
abstract class shital {                          //Valid
    abstract void pp ();
}
class test1 extends A1{}
//class test2 extends A1, B1 {}                  //InValid - multiple inheritance in class is not allowed.
class test3 implements I11 {}                    //Valid
class test4 implements I11, I12 {}               //Valid
class test5 extends A1 implements I11, I12 {}    //Valid
//class test6 implements I11 extends A1 {}       //Invalid always extends first then implement
//interface I3 extends A1{}                      //Invalid interface cannot extend anything.
interface I4 {                                   //Valid
    default void m1(){}                          //Valid also multiple default possible
    static void m2 (){}                          //Valid
}
