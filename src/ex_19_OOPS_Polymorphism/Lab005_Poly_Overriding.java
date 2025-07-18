package ex_19_OOPS_Polymorphism;

public class Lab005_Poly_Overriding {
    public static void main(String[] args) {

        //Override -- same method in two different class
       Dog d1 = new Dog();
       d1.sound();
    }
}
class Animal {
    void sound() {
        System.out.println("Default Sound");
    }
}
    class Dog extends Animal{
      @Override
        void sound (){
            System.out.println("Bark");
    }
}
