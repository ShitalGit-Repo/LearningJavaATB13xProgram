package ex_21_Abstract_Interface;

public class Lab001_AB_Cars {
    public static void main(String[] args) {

        WagonR car = new WagonR();
        car.drive();

    }
}
    abstract class engine {
        abstract void startengine();
        abstract void stopengine();
        void checkengine (){
            System.out.println("Everything is good!");
        }
    }
    class WagonR extends engine {

        @Override
        void startengine() {
            System.out.println("Starting the car");
        }
        @Override
        void stopengine(){
            System.out.println("Stoping the car");
        }
        void drive (){
            checkengine();
            startengine();
            stopengine();
        }
    }

