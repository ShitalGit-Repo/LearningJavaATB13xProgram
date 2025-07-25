package ex_28_Wrapper_Class;

public class Primitive_Wrapper {
//Wrapper is a object so have attribute or behaviour but int is a data type and do not have attribute & behaviour
    //char, byte, long, short, float, double - Avoid
    //Instead use Character, Boolean, Short, Long, Double, Float
    public static void main(String[] args) {
    //    int a = 10;      //DATATYPE
        Integer age = 65;  //OBJECT - ATTRIBUTE & BEHAVIOUR

//Advantage - all functions are available.
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(age.intValue());
    }
}
