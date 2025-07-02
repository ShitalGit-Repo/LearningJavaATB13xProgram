package ex_03_Operators;

public class Lab014_Operator {
    public static void main(String[] args) {

        //Assignment Operator
        int age = 65;
        //int -> data type.
        //age -> Identifier.
        //= -> Assignment Operator - assign RHV to LH
        //65 -> Literal

        System.out.println(age);

        //Arithmetic Operator -> +, -, /, *

        int a = 20;
        int b = 3;
        float c = 3.0f;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);   //in case of int answer is in integer.
        System.out.println(a / c);  // in case of float answer is in float.

        System.out.println("a+b"); //-> due to " it will act as a string and will print a+b

        //% -> Modulus - Returns remainder.

    }
}
