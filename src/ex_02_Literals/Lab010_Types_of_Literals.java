package ex_02_Literals;

public class Lab010_Types_of_Literals {
    public static void main(String[] args) {
        int a = 65;

        //Binary Literal - Never going to be used in automation framework
        int binary_num = 0b1010;  //add 0b at the start denotes decimal system 10.
        System.out.println(binary_num);

        //Octal Literal - Never going to be used in automation framework
        int octal = 0101;
        System.out.println(octal);

        //Hexadecimal Literal - Never going to be used in automation framework
        int hex = 0Xface;
        System.out.println(hex);
    }
}
