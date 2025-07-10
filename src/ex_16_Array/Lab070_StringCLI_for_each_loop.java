package ex_16_Array;

public class Lab070_StringCLI_for_each_loop {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("-----");
        for(Object o:args){             //used object because it is parent clas of everyone.
//      for (String arg :args)          //this can be use as well optional
            System.out.println(o);      //System.out.println(arg);
        }
    }
}
