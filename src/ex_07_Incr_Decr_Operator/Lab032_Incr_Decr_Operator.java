package ex_07_Incr_Decr_Operator;

public class Lab032_Incr_Decr_Operator {                   //Expression and Result Table ERT
    public static void main(String[] args) {          // Value of a       value of b
        //Pre-increment
        int a = 10;                                   //    10               NA
        int b = ++a;                                  //    11               11
        System.out.println(a);                        //    11               11 (NA)
        System.out.println(b);                        //    11(NA)           11

        //Post Increment
        int c = 10;
        System.out.println(c++);
        System.out.println(c);

        int d = 10;
        int result = ++d;
        System.out.println(d);
        System.out.println(result);

        int e = 10;
        int result1 = e--;
        System.out.println(result1);
        System.out.println(e);



    }
}
