package ex_02_Literals;

public class Lab008_Literal {
    //JVM only assign the value to instance variable
    int i;

    public static void main(String[] args) {

        // int local;    //Invalid JVM wil never assign the value to local variables.
        int local = 1;   //User needs to assign the value always.
        final float PI = 3.14f;  //PI=3.14F, This is final value and user can't edit.
        System.out.println(PI);
    }
}
