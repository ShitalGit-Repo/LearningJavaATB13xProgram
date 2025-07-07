package ex_13_Functions;

import org.w3c.dom.ls.LSOutput;

public class Lab053_user_define_function {
    public static void main(String[] args) {


//Type 1 - without parameter without return type
        wp_wr();

//Type 2 - without parameter but with return type
        String message = wp_with_return();
        System.out.println(message);

//Type 3 - with parameter without return type
        with_pm_without_r("shital", 25, 200000);
        with_pm_without_r("ankita", 34, 300000);

//Type 4 - with parameter with return type
        int result = sum_of_number(3, 4);
        System.out.println(result);
    }

    //Type 1 - without parameter and without return type
    static void wp_wr() {
        System.out.println("Just printing stuff");
    }

    //Type 2 - without parameter but with return type
    static String wp_with_return() {
        System.out.println("Hi");
        return "how are you";
    }

    //Type 3 - with parameter but without return type
    static void with_pm_without_r(String name, int age, double salary) {
        System.out.println("Your name is " + name + "\nYour age is " + age + "\nYour salary is " + salary);
    }

    //Type 4 - with parameter with return type
    static int sum_of_number(int a, int b) {
        return a + b;
    }
}
