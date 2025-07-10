package ex_16_Array;

public class Lab072_Copy_an_Array {
    public static void main(String[] args) {
        int [] original = {1, 2, 3};
        int[] copy = new int[original.length];
        System.arraycopy(original,0,copy,0,original.length);

    }
}
