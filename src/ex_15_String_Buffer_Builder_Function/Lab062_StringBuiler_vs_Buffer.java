package ex_15_String_Buffer_Builder_Function;

public class Lab062_StringBuiler_vs_Buffer {
    public static void main(String[] args) {
        String s0 = "Shital";
        String s1 = new String("Shital");

        StringBuffer stringBuffer = new StringBuffer("Shital");
        StringBuilder stringBuilder = new StringBuilder("Shital");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
//StringBuilder and StringBuffer are mutable in nature.
        stringBuffer.append("Awachar");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());

        stringBuilder.append("123");
        System.out.println(stringBuilder);

        String p1 = "Hello";
        String p2 = "World";
        String p3 = p1+p2;      //It will create new string
        System.out.println(p1);
        System.out.println(p3);


    }
}
