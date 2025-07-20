package ex_22_Abstraction_Interface;

public class Lab001_Abstraction_with_Interface {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.getarea(10,10);

        Square s1 = new Square();
        s1.getarea(3, 4);

    }
}
class Rectangle implements Polygon{
    @Override
    public void getarea(int length, int breadth){
        System.out.println("Area of rectangle->"+(length*breadth));
    }
}
class Square implements Polygon{
    @Override
    public void getarea(int length, int breadth){
        System.out.println("Area of square->"+3.14*length*breadth);
    }
}
interface Polygon{
    void getarea(int length, int breadth);
//we can't have a complete method in interface.
    //void complete(){
   // }
//but we can create by using default
    default void complete(){
        System.out.println("you can have complete method using default");
    }
    default void complete2(){
        System.out.println("Multiple defaults functions are allowed");
    }
    static void staticcomplete(){
        System.out.println("\"you can have complete method using static");
    }

}