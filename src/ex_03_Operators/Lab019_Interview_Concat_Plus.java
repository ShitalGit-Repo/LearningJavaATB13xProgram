package ex_03_Operators;

public class Lab019_Interview_Concat_Plus {
    public static void main(String[] args) {

        // Concatenation -> Means combining, Adding or Joining.
        // Operator behave differently with different data type
        // In case of string it will combine the two string as below.

        System.out.println("shital" + "awachar");      // only concatenation is supported.
        //System.out.println("shital" - "awachar");    // Not Supported.
        //System.out.println("shital" * "awachar");    // Not Supported.
        //System.out.println("shital" / "awachar");    // Not Supported.

        //In case of integer, it will perform arithmetic operation as bellow.

        int a = 10;
        int b = 20;
        System.out.println(a + b); // will add integer


    }
}
