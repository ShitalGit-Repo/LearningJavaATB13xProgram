package ex_09_switch_statement;

public class Lab039_switch_interview_question {
    public static void main(String[] args) {

        int a = 10;
        char ch = 'A';
        switch (a){

        }
        switch (ch){
            case 65 :
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No match");
        }

        int z = 11;   //this is given just to confuse.
        switch (-1){
            case -1:
                System.out.println("10");
                break;
            case 9 :
                System.out.println("9");
                break;
            default:
                System.out.println("Default");
                break;

        }
    }
}
