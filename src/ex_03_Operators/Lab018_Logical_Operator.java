package ex_03_Operators;

public class Lab018_Logical_Operator {
    public static void main(String[] args) {
        //Logical Operator
        boolean a = true;
        System.out.println(!a);  // ! -> Reverse.

        boolean b = true;
        System.out.println(!!b); // !! -> answer then again  reverse.


        //     AND Gate &&         OR Gate ||

        //     A    B    Z        A     B    Z
        //     0    0    0        0     0    0
        //     0    1    0        0     1    1
        //     1    0    0        1     0    1
        //     1    1    1        1     1    1

        boolean c = true || false; // || -> OR.
        System.out.println(c);

        boolean d = true && false;
        System.out.println(d);
    }
}
