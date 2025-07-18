package ex_19_OOPS_Polymorphism;

public class Lab004_Overloading_Practise {
    public static void main(String[] args) {
        CalC c1 = new CalC();
        c1.add(3, 4);
        c1.add(3.14, 4.56);

    }
}
class CalC {

    public int add (int a, int b){
        return a + b;
    }
    public double add (double a, double b){
        return a + b;
    }
}
