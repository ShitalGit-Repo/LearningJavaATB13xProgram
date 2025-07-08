package ex_14_Strings;

public class Lab056_Strings_Immutable {
    public static void main(String[] args) {
// strings are immutable so whenever you perform any operation with strings it creates new string.
        String name = "shital";     //created in string constant pool
//        name.toUpperCase();       //only by doing this value will not be change
        name = name.toUpperCase();  //after reassigning value will change and will print the same.
        System.out.println(name);

        String s1 = "hello";
        s1.concat("world");     //value remain same as we have not yet reassigned.
        System.out.println(s1);
        s1 = s1.concat("world"); //after reassigning, the value will be change.
        System.out.println(s1);

    }

}
