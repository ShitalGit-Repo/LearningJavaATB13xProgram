package ex_10_Loops;

public class Lab044_for_loop_with_break {
    public static void main(String[] args) {

//CASE 1 - for loop + break + if
        for (int i=0; i<50; i++){
            if (i==5){
                break;
            }
        }
//CASE 2 - for loop + break + if + else
        for (int j=0; j<50; j++){
            if (j==5){
                break;
            }else{
                System.out.println(j);
            }
        }
    }
}
