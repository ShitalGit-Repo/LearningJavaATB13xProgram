package ex_15_String_Buffer_Builder_Function;

import java.util.Scanner;

public class Lab064_Interview_Q {
    public static void main(String[] args) {

//Q - write a java program to count vowels & consonants by taking user input.
        //example - user input - shital - vowels 2 i, a - consonants 4 s h t l
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string");
        String input = scanner.next();
//      String input = "Java Program to Count vowels and Consonants";
        char cc = input.charAt(0);        //to find character
        int vowels = 0;
        int consonants = 0;
        input = input.toLowerCase();     //converting into lowercase.
        System.out.println(input);

        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("No of vowels " + vowels);
        System.out.println("No of consonants " + consonants);
    }
}
