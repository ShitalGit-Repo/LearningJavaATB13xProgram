package ex_18_OOPS_Inheritance;

public class Lab084_OOPS_Inheritance {
//Inheritance Concept - sub class can access the data from parent class.
//Single, Multilevel and Hierarchical inheritance is possible with classes in java.
//Multiple and Hybrid inheritance with classes is not allowed in java as -
//JVM will confuse which value to assign
//Multiple and Hybrid inheritance is possible with interfaces.

    public static void main(String[] args) {

        Father f1 = new Father();
        System.out.println(f1.gold);
        f1.bhk2();

        son s1 = new son();
        System.out.println(s1.gold); //son is able to access gold from father's class due to inheritance
        s1.bhk2();//son is able to access bhk2 from father's class due to inheritance
        s1.bhk3();
    }
}
class Father {
    int gold = 1000;

    void bhk2(){
        System.out.println("Father's 2bhk");
    }
}
class son extends Father {
    void bhk3(){
        System.out.println("Son's 3bhk");
    }
}