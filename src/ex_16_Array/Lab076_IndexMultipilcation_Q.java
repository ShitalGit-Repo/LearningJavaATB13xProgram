package ex_16_Array;

import java.util.Scanner;

public class Lab076_IndexMultipilcation_Q {
    public static void main(String[] args) {

//Print multiplication og index
        //Index Representation Matrix
        //Logic we want i=j,i>j,
        //0,0=0    0,1=0    0,1=0
        //1,0=0    1,1=1    1,2=2
        //2,0=0    2,1=2    2,2=4

        System.out.println("Enter size of the table");
        Scanner scanner = new Scanner(System.in);
        int size_of_the_table = scanner.nextInt();

        for (int i = 0; i < size_of_the_table; i++) {
            for (int j = 0; j < size_of_the_table; j++) {
                System.out.print(i*j+" | ");
            }
            System.out.println();
        }
    }
}
