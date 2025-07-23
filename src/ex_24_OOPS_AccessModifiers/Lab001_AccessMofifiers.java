package ex_24_OOPS_AccessModifiers;

public class Lab001_AccessMofifiers {
    public static void main(String[] args) {

    }

}
class Father {
    private int gold = 123;
    int car = 1;
    public int bhk3 = 1;
}
class Son extends Father {
    void wecanuse(){
       // System.out.println(gold); //we can't use gold as it is private.
        System.out.println(car);    //we can use as it is in same class.
        System.out.println(bhk3);   //we can use it is public
    }
}