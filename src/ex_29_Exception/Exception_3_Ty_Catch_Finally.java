package ex_29_Exception;

public class Exception_3_Ty_Catch_Finally {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int c = 0;
        try {
            int d = 10/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Finally block which will execute always");
        }

    }
}
