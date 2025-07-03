package ex_06_User_Input;

public class Lab029_UserInput_CLI {
    public static void main(String[] args) {

        //to run this, click on 3 dots -> Edit -> pass arguments -> run
        //the arguments are already present in main class (main(String[] args))but we can't use it directly.

        String age_string = args[0];   //we have to create string first.
        System.out.println(age_string);
        int age = Integer.parseInt(age_string);
        String canIvote = (age >= 18) ? "yes" : "no";
        System.out.println(canIvote);
    }
}
