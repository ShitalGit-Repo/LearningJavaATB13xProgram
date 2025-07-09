package ex_14_Strings;

import java.util.Scanner;

public class Lab061_Interview_q {
    public static void main(String[] args) {

//check whether the string is palindrome or not using user input.

        Scanner scanner = new Scanner(System.in);           //created to take user input
        System.out.println("Enter the string");             //taking user input
        String Input = scanner.next();                      //save input from user
//way1- String newstring_reversed = resverseStringSB(Input);//save reverse of the string enter by user
        String newstring_reversed = reverseString(Input);

        if(newstring_reversed.equalsIgnoreCase(Input)){     //compare the reverse string and string entered by user ignore case here.
            System.out.println("Palindrome");               //after checking if it is equal will print palindrome
        }else{
            System.out.println("Not Palindrome");           //if not equal will print not palindrome
        }
    }
//Way 1 - by using inbuilt function that we should not use.
    static String resverseStringSB (String userInput){      //will reverse the string entered by user
        StringBuilder stringBuilder = new StringBuilder(userInput);//created reference
        return stringBuilder.reverse().toString();
    }
//Way 2 - without using inbuilt function.
    static String reverseString(String UserInput){
        String reversed = "";
        for (int i = UserInput.length()-1; i>=0; i--){      //here we take reverse of user input. can use both i-- or --i
            reversed = reversed + UserInput.charAt(i);      //will return means check the character one by one.
        }
        return reversed;
    }
}

