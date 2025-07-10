package ex_16_Array;

import java.util.Scanner;

public class Lab068_Array_User_Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array (int only)");
        int size = scanner.nextInt();

        int[] number_marks = new int[size]; //here we used int but it can be string, float
        for (int i = 0; i < number_marks.length; i++) {
            System.out.println("Enter the numbers");
            number_marks[i] = scanner.nextInt();
        }
        System.out.println("---Below code is printing the elements ---");
        for (int i = 0; i < number_marks.length; i++) {
            System.out.println(number_marks[i]);
        }
    }
}
