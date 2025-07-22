package ex_023_static;

public class Static_Web_Automation {
    public static void main(String[] args) {

        Automation t1 = new Automation();
        Automation t2 = new Automation();
        Automation t3 = new Automation();

        System.out.println(t1.driver);
        System.out.println(t2.driver);
        System.out.println(t3.driver);

    }
}
class Automation {
    static String driver = "Chrome";
}
