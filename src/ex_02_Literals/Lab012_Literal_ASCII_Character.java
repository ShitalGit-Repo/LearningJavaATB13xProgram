package ex_02_Literals;

public class Lab012_Literal_ASCII_Character {
    public static void main(String[] args) {

        //ASCII values -- simply american map each character with numbers.
        //ASCII value 0-225
        char c1 = 'A';

        //then Unicode (India, Japan, China) is introduced with range 0-65535
        char c2 = '\u1F60';
        char my_laugh_smily = '\u1f60';  //:)
        System.out.println(my_laugh_smily);


    }

}
