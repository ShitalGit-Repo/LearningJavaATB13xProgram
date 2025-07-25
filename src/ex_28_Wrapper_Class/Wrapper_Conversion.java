package ex_28_Wrapper_Class;

public class Wrapper_Conversion {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a; //Primitive to wrapper conversion termed as "Autoboxing"

        Integer c = 34;
        int d = c;     //Removing the wrapper termed as unboxing. removing attribute and behaviour.

        String num = "10" ;
        int aa = Integer.parseInt(num);

        //string to wrapper
        Integer e = Integer.parseInt(num);
        Integer f = Integer.valueOf(num);

        //string to primitive
        int g = Integer.parseInt(num);

        //wrapper to string(toStrngMethod)
        System.out.println(e.toString());

        //primitive to string
        int age = 10;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString());


    }
}
