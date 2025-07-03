package ex_06_User_Input;

import java.util.Scanner;

public class Lab031_UserInput_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();   //nextInt is a function that automatic will fetch the integer only for string char it will give exception error.
        String canIvote = (age >= 18) ? "yes" : "no";
        System.out.println(canIvote);

        System.out.println("Enter the string");
        String name = scanner.next();
        System.out.println(name);
    }
}
