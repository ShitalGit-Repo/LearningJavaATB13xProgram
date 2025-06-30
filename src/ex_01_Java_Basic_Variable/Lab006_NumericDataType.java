package ex_01_Java_Basic_Variable;

public class Lab006_NumericDataType {

    public static void main(String[] args) {

        //byte range is from +127 to -127
        byte a = 100;
        byte b = 127;       //byte b = 128 = invalid
        byte c = -127;     //byte d = -128; = invalid
        int d = 10;
        short e = 20;
        char f = 'F';
        long g = 4000000000l;
        long h = 500000000L;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

    }
}
