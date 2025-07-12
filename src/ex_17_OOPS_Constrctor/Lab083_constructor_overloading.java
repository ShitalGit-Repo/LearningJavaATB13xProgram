package ex_17_OOPS_Constrctor;

public class Lab083_constructor_overloading {
    public static void main(String[] args) {

        Person p1 = new Person("amit", 1234567, "pune");
        Person p2 = new Person("kajal", 987654, "banglore");
        Person p3 = new Person();
        p3.name = "shikha";
        System.out.println(p3.name);
        Person p4 = new Person("lucky", 567894);
        System.out.println(p4.address);

        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();
    }
}
class Person{
    String name;
    long phone_no;
    String address;

    Person(){                   //default constructor
    }
    Person(String name_args, long phone_no_args, String address_args){
        this.name = name_args;
        this.phone_no = phone_no_args;
        this.address = address_args;
    }
    Person(String name_args, long phone_no_args){
        this.name = name;
        this.phone_no = phone_no_args;
    }
    void eat(){
        System.out.println(this.name + " is eating");
    }
}