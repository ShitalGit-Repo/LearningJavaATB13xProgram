package ex_18_OOPS_Inheritance_Hierarchical;

public class Hierarchical {
    //Hierarchical Inheritance
    public static void main(String[] args) {
        Father f1 = new Father();
        lucky l1 = new lucky();
        Ruhani r1 = new Ruhani();

        r1.Home();
        l1.Home();
    }

}
class Father {
    void Home (){
        System.out.println("3bhk");
    }
}
class lucky extends Father {
    void l2 (){
        System.out.println("Lucky");
    }
}
class Ruhani extends Father {
    void r (){
        System.out.println("Ruhani");
    }
}