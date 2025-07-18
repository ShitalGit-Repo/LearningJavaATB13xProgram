package ex_19_OOPS_Polymorphism;

public class Lab002_Overloading_Example {
    public static void main(String[] args) {

        Home h1 = new Home();
        h1.task(3);
        h1.task(true);


    }
}

class Home {
    void task (){
        System.out.println("Task1");
        return;
    }
    int task (int a){
        System.out.println("Task2");
        return a;
    }
    boolean task (boolean a){
        return false;
    }
}
