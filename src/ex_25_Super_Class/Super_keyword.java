package ex_25_Super_Class;

public class Super_keyword {

//super keyword is used to access variable from parent class.

    public static void main(String[] args) {
        Car c1 = new Car(100);
        c1.Display();
    }

}
class Vehicle {
    public int maxspeed = 180;

    Vehicle (){
        System.out.println("Default Constructor");
    }
    Vehicle (int a){
        System.out.println("Parameterized Constructor");
    }
    //Overloading
    void message (int a){
        System.out.println("Parameterized Constructor ");
    }
    void message (){
        System.out.println("Constructor without return and parameter");
    }
    int message (String a){
        System.out.println("Parameterized Constructor with return type");
        return 0;
    }
    void Display(){
        System.out.println("Parent Vehicle");
    }

}
class Car extends Vehicle {
    private int maxspeed = 281;

    public int getMaxspeed (){
        return maxspeed;
    }
    public void setMaxspeed(int maxspeed){
        this.maxspeed = maxspeed;
    }
    Car (){
        super();           //super keyword is used to call parent constructor.
    }
    Car (int a){
        super(10);
//      this();       //if you want to call your own then remove super and add this.
    }

    @Override
    void Display() {
        System.out.println("Override Method");
        System.out.println(super.maxspeed);   //will bring speed value from vehicle(parent) class.
        System.out.println(this.maxspeed);    //will bring speed value from Car class.
    }
}