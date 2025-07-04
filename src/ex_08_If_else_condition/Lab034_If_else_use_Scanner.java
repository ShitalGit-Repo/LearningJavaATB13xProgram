package ex_08_If_else_condition;

import java.util.Scanner;

public class Lab034_If_else_use_Scanner {
    public static void main(String[] args) {
        // If_else - decision making in programming.
        //Disadvantage - in multicondition. it is complex.Break and continue keywords can't be used.

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
