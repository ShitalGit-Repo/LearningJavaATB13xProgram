package ex_10_Loops;

public class Lab042_ForLoop_withoutCondition {
    public static void main(String[] args) {
        //when no condition inserted loop will run to infinity and has to stop forcefully.
        for (int i=0; ; i++){
            System.out.println(i);
        }

    }
}
