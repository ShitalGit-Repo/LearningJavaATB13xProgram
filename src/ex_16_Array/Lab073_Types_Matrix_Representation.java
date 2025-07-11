package ex_16_Array;

public class Lab073_Types_Matrix_Representation {
    public static void main(String[] args) {

        //2D Array

        int [][] array_2d = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(array_2d);
        int [][] array;
        array = new int [][]{
                {10, 20},
                {30, 40},
                {50, 60}
        };
        System.out.println(array);
//Empty Array
        int [][] empty_2d_array = new int [3][3];
        empty_2d_array [0][0] = 1;
        empty_2d_array [0][1] = 2;
        empty_2d_array [0][2] = 3;

        empty_2d_array [1][0] = 1;
        empty_2d_array [1][1] = 3;
        empty_2d_array [1][2] = 5;

        empty_2d_array [1][0] = 2;
        empty_2d_array [1][1] = 4;
        empty_2d_array [1][2] = 6;

        System.out.println(empty_2d_array);

//Jagged Array - each array can have different length
        int [][] jagged_array = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7}
        };


    }
}
