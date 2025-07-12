package ex_17_OOPS_Constrctor;

public class Lab081_Practice2 {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.name = "Tesla";           //when it is not assigned here, it will print the name assign in default constructor
        Car c2 = new Car();
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);
        System.out.println(c2.name);
        c2.name = "Audi";
        System.out.println(c2.name);
    }
}
class Car {                      //here we created class
    String name;
    int year;
    String model;

    //DC
    Car(){                      //here we created direct constructor to pass value
        name = "Tata";
        year = 2025;
        model = "XXX";

    }
}