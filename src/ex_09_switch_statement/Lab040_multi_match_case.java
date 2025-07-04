package ex_09_switch_statement;

public class Lab040_multi_match_case {
    public static void main(String[] args) {

        int itemcode = 006;

        switch (itemcode) {
            case 001,002,005 :
                System.out.println("All of them are electronic gadget");
                break;
            case 004,006,007:
                System.out.println("This is mech gadget");
                break;
            default:
                System.out.println("None");

        }
//jdk > 13 -- no need to add break
        int code = 001;
        switch (code) {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
        }
    }
}
