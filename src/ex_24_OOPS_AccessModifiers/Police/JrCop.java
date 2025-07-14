package ex_24_OOPS_AccessModifiers.Police;

public class JrCop {
    public static void main(String[] args) {
        Cop JrCop = new Cop(5);
        JrCop.canIshoot();   //we make this protected so that class within same package can access
        JrCop.thisDefault(); //default acts as a protected and able to access it withing the package

    }
}
