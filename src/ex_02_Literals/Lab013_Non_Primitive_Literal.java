package ex_02_Literals;

public class Lab013_Non_Primitive_Literal {
    public static void main(String[] args) {
        //Primitive_Literal -- Defined by java guys.
        //Max, Min, Size is already defined.
        byte b = 10;  //1 Byte->8 bits
        int age = 65;  //4 Bytes->32 bits

        //Non-Primitive Literal -- Defined by users, Reference data types.
        //No Min, Max, Size.
        //Byte 8 -> 64 bites.
        String name = "shital";
        int[] array_of_items = new int[10];

        System.out.println(name);
        System.out.println(array_of_items);

    }
}
