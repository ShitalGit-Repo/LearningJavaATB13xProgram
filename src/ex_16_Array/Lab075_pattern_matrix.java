package ex_16_Array;

import java.util.Scanner;

public class Lab075_pattern_matrix {
    public static void main(String[] args) {

//print right angle triangle pattern y taking user input.
        //n = 3    //*
                   //**
                   //***
        System.out.println("Enter value of n, e.g.n=3");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();                    //Index Representation Matrix
                                                      //Logic we want i=j,i>j,
        for (int i = 0; i < n ; i++) {                //0,0    0,1    0,2
            for (int j = 0; j <= i; j++) {            //1,0    1,1    1,2
                System.out.print("*");                //2,0    2,1    2,2
            }
            System.out.println();
        }
        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
