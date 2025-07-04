package ex_08_If_else_condition;

public class Lab035_If_else_Use_arguments {
    public static void main(String[] args) {

        //to run this, click on 3 dots -> Edit -> pass arguments -> run
        int age = Integer.parseInt(args[0]);

        if(age >= 18) {
            System.out.println("Allowed to vote");
        }else{
            System.out.println("Not allowed to vote");
        }

    }
}
