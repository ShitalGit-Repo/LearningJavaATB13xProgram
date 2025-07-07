package ex_12_do_while_loop;

public class Lab050_do_while_loop {
    public static void main(String[] args) {

// difference between while and do while loop

        //do_while_loop - value of a a will print at least one time as it will check condition later.
        int a = 1;
        do {
            System.out.println("This is body which will execute 1 time");
            System.out.println(a);
            a++;
        }while (a<10);

// while loop - it will not print the value a single time - no o/p.
        int b= 0;
        while (b<0){
            System.out.println("b");
            b++;
        }
    }
}
