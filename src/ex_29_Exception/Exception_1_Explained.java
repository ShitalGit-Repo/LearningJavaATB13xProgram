package ex_29_Exception;

public class Exception_1_Explained {
    public static void main(String[] args) {
        System.out.println("Starting the program");
        String user_input = args[0]; //java.lang.g.ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(user_input); //java.lang.NumberFormatException
//in this program if user enters value 0 then 100/0 is invalid and will throw exception
//to handle this select Integer output = 100/a; and select surround -> try and catch
        Integer output = 0;   //java.lang.AirthmaticException: /0
        try {
            output = 100/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Div by zero not allowed");
        }
        System.out.println(output);
        System.out.println("End of the program");



    }
}
