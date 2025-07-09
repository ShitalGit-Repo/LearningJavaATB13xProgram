package ex_15_String_Buffer_Builder_Function;

public class Lab063_String_Builder_Buffer_functions {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);
        sb.delete(5, 16);        //delete substring
        System.out.println(sb);
        sb.replace(0, 4, "c++");
        System.out.println(sb);
    }
}
