package ex_03_Operators;

public class Lab020_Interview_Concat_Plus {
    public static void main(String[] args) {

        String first_name = "shital";
        String last_name = "awachar";

        int a = 10;
        int b = 10;

        //For below case, if + is working as a concatenation then for a+b it will act same.
        System.out.println(first_name + last_name + a + b );

        //For below case, a+b will be addition and then concatenation.
        System.out.println( a + b + first_name + last_name );

        //For below case, a+b will be addition because of BOMAS
        //BODMAS(Bracket of Division, Multiplication, Addition, Substraction).
        System.out.println(first_name + last_name + (a + b) );
    }
}
