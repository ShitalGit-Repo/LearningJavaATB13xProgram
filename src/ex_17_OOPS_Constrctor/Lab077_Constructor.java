package ex_17_OOPS_Constrctor;

public class Lab077_Constructor {
//we can't have two public class
    public static void main(String[] args) {

        Student s1 = new Student ();     //object creation
        s1.name = "shital";
        System.out.println(s1.name);
        Student s2;                      //constructor will be called once because
                                         //References are two but object creation is one.
        new Student();                   //Object creation without name.
    }
}
class Student{
    String name;
//Default Constructor - same name as class name.
    Student(){
        System.out.println("Default Constructor");
    }

    void sleep(){
        System.out.println("Hi");
    }
}
