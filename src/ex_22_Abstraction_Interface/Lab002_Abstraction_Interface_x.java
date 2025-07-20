package ex_22_Abstraction_Interface;

public class Lab002_Abstraction_Interface_x {
    public static void main(String[] args) {
        Car1 tesla = new Car1();
        tesla.drivr();
    }

}
//Multiple inheritance is possible in interference.
class Car1 implements Engine, Breakes{

    void drivr(){
        startEngine();
        stopEngine();
        applyBreakes();
    }
    @Override
    public void applyBreakes() {
        System.out.println("Apply Breakes");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }
}
interface Breakes{
    void applyBreakes();
}
interface Engine{
    void startEngine();
    void stopEngine();
    default void Complete(){
        System.out.println("Default complete function");
    }
}
