package ex_07_Incr_Decr_Operator;

public class Lab033_Incr_Decr_ex {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);   //10+11=21

        int b = 10;
        System.out.println(b++ + ++b);  //10+12=22
        System.out.println(b);          //12

        int c = 10;
        System.out.println(++c + ++c);  //11+12=23
        System.out.println(c);          //12
    }
}
