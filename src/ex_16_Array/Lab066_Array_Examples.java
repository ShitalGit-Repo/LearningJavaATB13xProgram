package ex_16_Array;

import java.util.Arrays;

public class Lab066_Array_Examples {
    public static void main(String[] args) {

        int [] marks = {51, 100, 91, 87, 90};

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }
        Arrays.sort(marks);
        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }
//        System.out.println(marks);          //will print the reference address if we pass string name without index

    }
}
