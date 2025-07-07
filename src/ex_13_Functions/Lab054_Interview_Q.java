package ex_13_Functions;

public class Lab054_Interview_Q {
    public static void main(String[] args) { //main method that JVM recognise
       //There can be multiple main method but will run only one.
    }
    public static void main(String args){     //duplicate
        System.out.println("Printing Yes");
    }
    public static int main (int args){        //duplicate
        return 10;
    }
    public static int main(float args){       //duplicate
        return 10;
    }
}
