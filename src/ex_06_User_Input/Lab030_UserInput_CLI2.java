package ex_06_User_Input;

public class Lab030_UserInput_CLI2 {
    public static void main(String[] args) {

        //to run this, click on 3 dots -> Edit -> pass arguments -> run
        //here we passed 5 arguments 10 20 30 40 50 but it will print 4 and will give error 5 onwards.
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        System.out.println(args[10]);
    }
}
