package ex_10_Loops;

public class Lab046_while_loop {
    public static void main(String[] args) {

//when to use for loop and while loop
//If you want to do initialization outside, use while loop.
//If initialization needed ind=side use for loop.

//CASE 1 - While loop                         // similar to for loop
        int i = 0;                            //for(int i=0; i<10; i++)
        while (i<10){                         //System.out.println(i);
            System.out.println(i);
        i++;
        }
        int j = i;
        while (j<=15){
            System.out.println(j);
            j++;
        }
//CASE 2 - There will be no o/p
        int k = 0;
        while (k<0){
            System.out.println(k);
            k++;
        }
//CASE 3 - Infinite loop
        while (true){
            System.out.println("shital");
        }
    }
}

