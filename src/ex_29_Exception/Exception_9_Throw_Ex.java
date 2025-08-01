package ex_29_Exception;

import java.util.Scanner;

public class Exception_9_Throw_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try {
            validateage(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void validateage(int age) throws Exception{
        if (age < 18){
            throw new Exception("Minor age");
        }
    }
}
