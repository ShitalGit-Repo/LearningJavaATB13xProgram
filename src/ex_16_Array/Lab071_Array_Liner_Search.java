package ex_16_Array;

public class Lab071_Array_Liner_Search {
    public static void main(String[] args) {

//Find element in an array. search 67 from below array and its index.
        int [] a = {23, 43, 45, 67, 87, 90};
        int target = 67;
        for (int i = 0; i < a.length; i++) {
            if(target == a[i]){
                System.out.println(i);
            }
        }
    }
}
