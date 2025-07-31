package ex_29_Exception;

import java.io.FileInputStream;

public class Exception_7_Throws {
    public static void main(String[] args) {

    }
    static void t() throws Exception{   //instead of try catch use complete method with throws keyword.

            FileInputStream fileInputStream = new FileInputStream("c://a.txt");
    }
}
