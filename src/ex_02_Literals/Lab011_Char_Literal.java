package ex_02_Literals;

public class Lab011_Char_Literal {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = '@';
        char c3 = '_';
        char c4 = '1';
        char c5 = '(';

        //Excape Character
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("ShitalAwachar");
        System.out.println("Shital" + new_line + "Awachar");
        System.out.println("Shital" + tab_line + "Awachar");
        System.out.println("Shital" + back_space + "Awachar");
        System.out.println("Shital is old" + carriage_return + "Awachar");

        System.out.println("Hi, This is first line" + new_line + "Hi, This is second line\nThis is third line");

    }
}
