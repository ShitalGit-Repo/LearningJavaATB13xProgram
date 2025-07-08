package ex_14_Strings;

public class Lab059_String_InterviewQ {
    public static void main(String[] args) {

//Question 1 - Refer the following code and answer how many strings are created.
    String s1 = "Hello";
    String s4 = "Hello";
    String s10 = "Hello";
//Answer is it will create only one string as value is same ant is already created so it will assign the same value.
        String s11 = new String("Hello");
//Answer is 2 1 is in String constant pool and 1 is in Object Area.
        String s12 = new String("Hello");
        String s13 = new String("hello");
//Answer is 3. 1 in SCP and 2 in OA

//Question 2 -  Comaprison
        System.out.println(s1 == s12);
        System.out.println(s11 == s12);
        System.out.println(s1 == s4);

//Question 3 - equals()
        System.out.println(s1.equals(s12));
        System.out.println(s12.equals(s13));
        System.out.println(s12.equalsIgnoreCase(s13));


    }
}
