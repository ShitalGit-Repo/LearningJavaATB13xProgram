package ex_13_Functions;

import java.util.Scanner;

public class Lab055_Airt_Operations {
    public static void main(String[] args) {

//Create function sum, sub, multi, div with 2 parameters a & b entered by user.

//First step - take inputs from user
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        System.out.println("Enter number 1");
        if (scanner.hasNextInt()){
        a = scanner.nextInt();
        }else{
            System.out.println("Enter int only");
            return;  //or System.exit(0);
        }
        System.out.println("Enter number 2");
        int b = 0;
        if (scanner.hasNextInt()){
            b = scanner.nextInt();
        }else {
            System.out.println("Enter int only");
            return;  //or System.exit(0);
        }

        int result_sum = sum(a, b);
        System.out.println(result_sum);

        int result_sub = sub(a, b);
        System.out.println(result_sub);

        int result_multi = multi(a, b);
        System.out.println(result_multi);

        int result_div = div(a, b);
        System.out.println(result_div);

        int result_mod = mod(a, b);
        System.out.println(result_mod);
    }
    static int sum (int a, int b){
        return a+b;
    }
    static int sub (int a, int b){
        return a-b;
    }
    static int multi (int a, int b){
        return a*b;
    }
    static int div (int a, int b){
        if (b==0){
            System.out.println("B can't be 0");
      //      throw new ArithmeticException("b cant be 0")
            System.exit(0);
        }
        return a/b;
    }
    static int mod (int a, int b){
        return a%b;
    }
}
