package ex_11_while_loop;

import java.util.Random;
import java.util.Scanner;

public class Lab049_while_guessing_game {
    public static void main(String[] args) {

//Guessing game program - guess a no from 1-100
        Random random = new Random();
        int notoguess = random.nextInt(100)+1;
//        System.out.println(notoguess);   //we have to keep it as comment else it will print the number.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        int guess;
        int attempts = 0;

        while (true){
            System.out.println("Enter another guess");
            guess = scanner.nextInt();
            attempts++;

            if (guess < notoguess){
                System.out.println("Too low, try again");
            } else if (guess > notoguess) {
                System.out.println("Too high, try again");
            }else {
                System.out.println("Correct! you guess it in"+ attempts + "attempt");
            }
        }

    }

}
