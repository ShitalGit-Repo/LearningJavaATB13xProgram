package ex_08_If_else_condition;

import java.util.Scanner;

public class Lab036_Debugging {
    public static void main(String[] args) {

        // Debugging - Execute the code line by line to see the result.
        //use to find out the issue

        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >=18){
            System.out.println("Allowed to vote");
        }else{
            System.out.println("Not allowed to vote");
        }
    }

}
