package ex_01_Java_Basic_Variable;

public class Lab007_print_println_printf {
    public static void main(String[] args){

        int a = 10;

        System.out.print("Print command without the new line");
        System.out.println("Print command with new line");
        System.out.printf("Your variable name is %d", a);

        //%d = int, byte, long, short -- Data Types
        //%s = string
        //%f = float, double
        //%b = boolean
        //USE

        System.out.println("___");

        int b = 20;
        System.out.printf("%d + %d",a,b);

    }
}
