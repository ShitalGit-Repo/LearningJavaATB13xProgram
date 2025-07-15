package ex_23_Instance_Initialization_Block;

public class Instance_Initiation_Block {

//It will be executed when object is created
public static void main(String[] args) {
         A a = new A();
         A a2 = new A(); //as 2 objects are created every block will execute twice except static block
         new A();
}
}
class A{
    A(){
        System.out.println("Default Constructor");
    }
    {
        System.out.println("Instance Initiation Block");
        System.out.println("If you want to execute or call something when object is created");
    }
    {
        System.out.println("IIB-2");
    }
    {
        System.out.println("IIB-3");
    }
    {
        System.out.println("IIB-4");
    }
    static {
        System.out.println("Static Block");  //it will call only once.
    }
}