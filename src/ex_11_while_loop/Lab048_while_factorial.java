package ex_11_while_loop;

import java.util.Scanner;

public class Lab048_while_factorial {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Welcome to factorial program\nEnter the number");
        //handle negative scenario like user entered the string or negative value.line no 10-13
        if (!scanner.hasNextInt()){
            System.out.println("Enter the integer");
            return;                                        //handle for char if entered.
        }
        int number = scanner.nextInt();

        int factorial = 1;
        if(number<=0){
            System.out.println("Negative factorial is not allowed");
            return;                                                     //handle for negative value entered.
        }else{
            //calculate factorial
            for(int i=1; i<=number; i++){
                factorial = factorial*i;
            }
        }
        System.out.println("Factorial is->"+factorial);
    }
}
