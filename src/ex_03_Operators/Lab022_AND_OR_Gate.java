package ex_03_Operators;

public class Lab022_AND_OR_Gate {
    public static void main(String[] args) {

        //     AND Gate &&         OR Gate ||

        //     A    B    Z        A     B    Z
        //     0    0    0        0     0    0
        //     0    1    0        0     1    1
        //     1    0    0        1     0    1
        //     1    1    1        1     1    1

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

    }
}
