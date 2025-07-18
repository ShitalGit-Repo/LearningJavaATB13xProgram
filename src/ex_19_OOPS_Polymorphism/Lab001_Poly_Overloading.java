package ex_19_OOPS_Polymorphism;

public class Lab001_Poly_Overloading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int r1 = m1.add(3 , 4);
        int r2 = m1.add(3,4,6);
        double r3 = m1.add(3.14, 4.56);
        String r4 = m1.add("shital", "awachar");

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("r3: " + r3);
        System.out.println("r4: " + r4);
    }
}
class MathOperations {
    //Same name methods within same class but different arguments and return type.

    int add (int a, int b){
        return a+b;
    }
    int add (int a, int b, int c){
        return a+b+c;
    }
    double add (double a, double b){
        return a+b;
    }
    String add (String a, String b){
        return a+b;
    }

}
