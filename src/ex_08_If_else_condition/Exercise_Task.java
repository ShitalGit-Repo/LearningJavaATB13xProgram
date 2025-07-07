package ex_08_If_else_condition;

import java.util.Scanner;

public class Exercise_Task {

    public static void main(String[] args) {


        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scanner.next().charAt(0);
    //convert to lower case for easier comparison
        ch = Character.toLowerCase();

    //check input is the letter.

        if (ch >= 'a' && ch <= 'z'){
            if (ch == 'a'|| ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
                System.out.println(ch + "It's a vowel");
            }else{
                System.out.println("It's a consonant");
            }
        }else{
            System.out.println("Invalid input, plesae enter character");
        }
        scanner.close();
    }
}
