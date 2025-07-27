package ex_29_Exception;

public class Exception_2_Multiple_Catch {
    public static void main(String[] args) {

//Multiple catch is possible
//IMPORTANT - Exception is a bigger basket whereas other like Array, arithmetic are smaller one
//so before using Exception try for smaller one first
        System.out.println("Starting");
        try {
            int a = 10/0;
            String s1 = null;
            s1.trim();
        } catch (ArithmeticException | NullPointerException e) { //instead of long code you can add all exception in one go
            System.out.println("Invalid");;
        }catch(Exception e){
            System.out.println("INVALID");
        }
        System.out.println("Ending");
    }
}
