package ex_05_TypeCasting_Widening_Narrowing;

public class Lab029_TypeCasting_Use {
    public static void main(String[] args) {
        int bill = 100;
        float GST = 18.45f;
        //int total = bill + GST;    //Narrow Implicit -- Not Allowed.
        int total = bill + (int)GST; //Narrow Explicit - mention (int)GST explicitly.
        System.out.println(total);   // Data Loss of .45 due to int selection.

        //SO, it is very important to select correct data type while doing conversion as bellow.

        float total1 = bill + GST;        //Widening - auto implicit.
        float total2 = (float)bill + GST; //Widening - Explicit.

        System.out.println(total1);
        System.out.println(total2);
    }
}
