package ex_30_Generics;

public class Generics {
//Generic can be a class, method, list.
    public static void main(String[] args) {
        temp_sump(3,4);
        temp_sump(3.34, 4.45);
        temp_sump("shital","awachar");

//solution --
        display(4,5);
        display(1.23, 2.23);
        display("mumbai", "pune");
    }

    static int temp_sump(int a, int b){
        return a + b;
    }
    static double temp_sump(double a, double b){
        return a + b;
    }
    static String temp_sump(String a, String b){
        return a + b;
    }
//solution -- create generics
    static <T> void display (T c, T d){  //here you can use any letter or word instead of T
        System.out.println(c);
        System.out.println(d);
    }

}
