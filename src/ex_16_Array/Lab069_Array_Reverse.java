package ex_16_Array;

import java.util.Arrays;

public class Lab069_Array_Reverse {
    public static void main(String[] args) {

//Reverse an array.
        int sum = 0;
        int [] array = {1, 2 , 3, 4, 5};
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.println(array[i]);
        }
//sum of an array.
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
//2nd largest no from an array
        Arrays.sort(array);
        System.out.println(array[array.length-2]);

    }
}
