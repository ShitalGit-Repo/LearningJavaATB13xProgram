package ex_16_Array;

import java.util.Arrays;
public class Lab067_Array_Example_minmax {
    public static void main(String[] args) {

//Find min and max from array by using method.
//1 - by using function and not method. This is not a correct way.
        int [] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Arrays.sort(array);
        System.out.println(array[array.length-1 ]);
//2
        int max_output = max_no(array);
        System.out.println(max_output);

        int min_output = min_no(array);
        System.out.println(min_output);

    }
    static int max_no(int array[]){
        int max = array[0];
        //Logic
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    static int min_no(int array[]){
        int min = array[0];
        //Logic
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
