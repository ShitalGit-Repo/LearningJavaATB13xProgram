package ex_29_Exception;

public class Exception_5_Example {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 0;
        try {
           int x = 10/a;
        }catch (Exception e){
            System.out.println("Div by 0 is not allowed");
        }finally {
            System.out.println("Will execute anyhow");
        }

    }
}
