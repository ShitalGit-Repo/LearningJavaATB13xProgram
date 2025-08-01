package ex_29_Exception;

public class Exception_8_Throw {
    public static void main(String[] args) {

    }
    static void dividebyzero (int a){
        if (a==0){
            throw new ArithmeticException("Error a==0");
        }


    }
}
