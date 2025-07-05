package ex_10_Loops;

public class Lab041_For_Loop {
    public static void main(String[] args) {

        //Loops are used for repetitive code - help you repeat block of code.
        //For Loop
        //ICU - Initiation, Condition, Updation (INCR/DECR)
        for (int i = 0; i < 10; i++) {             //here we used the loop to execute block of code
            System.out.println(i);          //System.out.println(1);
        }                                   //System.out.println(2);
        //System.out.println(..);
        //System.out.println(10);
//CASE 1 - With variable
        for (int shital = 0; shital < 5; shital++) {
            System.out.println("value for CASE 1 is" + shital);
        }
//CASE 2 - with underscore is valid name
        for (int _1 = 10; _1 <= 15; _1++) {
            System.out.println("value for CASE 2 is" + _1);
        }
//CASE 3 - You can use for loop for long & float but never recommended.
        for (long k = 6l; k < 10; k++) {
            System.out.println("value for CASE 3 is" + k);
        }
        for (float l = 1.24f; l > 10.78; l++) {
            System.out.println(l);
        }
//CASE 4 - when no incr/decr inserted there will be no result.
        for (int j = 0; j > 10; ) {
            System.out.println("value for CASE 4 is" + j);
        }
//CASE 5 - in below case it will directly print end as condition is not satisfied. 0 is not grater than 1.
        for (int m = 0; m > 1; m++) {
            System.out.println("value for CASE 5 is " + m);
        }
        System.out.println("end");
//CASE 6 - with decr & following condition never be satisfy so there will be no result.
        for (int n = -1; n < -10; n--) {
            System.out.println("value for CASE 6 is" + n);
        }
//CASE 7 - Example - find even numbers from 1 to 50
        for (int p = 0; p <= 50; p++) {
            if (p % 2 == 0) {
                System.out.println("Even no ->" + p);
            }
        }
    }
}
