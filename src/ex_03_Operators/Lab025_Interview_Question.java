package ex_03_Operators;

public class Lab025_Interview_Question {
    public static void main(String[] args) {
        //characters acts as a integer.

        int a = 'A';   //ASCII Value is 65.
        int b = 'B';   //ASCII Value is 66.
        System.out.println(a+b); //it will take ASCII value and will add the numbers.

        System.out.println('A' == 65);

        short s = 10;
        char c = 'A';            // char + string concatenation is not possible.
        String s1 = "C";                   //STRANGE RULES IN JAVA.
        System.out.println(c+s); // When it is with own integral brother, then act as an integer.
        System.out.println(c);   // Alone will act as a character.
        System.out.println(c+c); // + will act as a concatenation.
        System.out.println(c+s1);
        System.out.println(s+s1);

    }
}
