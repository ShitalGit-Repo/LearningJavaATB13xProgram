package ex_29_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception_6_Example {
    public static void main(String[] args) {
        System.out.println("Starting");
        try {
            FileReader f = new FileReader(new File("c://abc.txt"));
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Ending");
    }
}
