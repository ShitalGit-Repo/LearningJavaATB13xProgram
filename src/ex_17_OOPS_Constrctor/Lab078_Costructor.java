package ex_17_OOPS_Constrctor;

public class Lab078_Costructor {
//Default constructor in main class
    Lab078_Costructor() {     //Default method can be created in main class.
        System.out.println("Default Constructor in main class");
    }
    public static void main(String[] args) {

        Cat c1 = new Cat();
        new Cat();           //object is created without name.
        Cat c2;              //object is not created

        c1.running();
//      c2.running();        //can't do object is not created for c2.
        new Cat().running(); //we can call running method as because object is created.
    }
}
class Cat{
    String name;

    void running (){
        System.out.println("Running");
    }
}
