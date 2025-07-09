package ex_14_Strings;

public class Lab060_String_Function2 {
    public static void main(String[] args) {

        String name = "Sonal";
        String s1 = "madam";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(10)); //will give error.
        System.out.println(name.concat("Patel"));
//Contains
        System.out.println(name.contains("om"));
//equals
        System.out.println(name.equals("Sonal"));
//equalIgnore
        System.out.println(name.equalsIgnoreCase("SONAL"));
//Index of
        System.out.println(s1.indexOf("m"));
        System.out.println(s1.lastIndexOf("m"));
//replace
        System.out.println(name.replace("n", "N"));
//Split
        String name4 = "shital@awachar";
        String [] split_name4 = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
//substring
        System.out.println(name.substring(1,3));
//startswith
        System.out.println(name.startsWith("S"));
//trim
        String t = " hi  ";
        String t2 = t.trim();
        System.out.println(t2);
//endswith
        System.out.println(name.endsWith("a"));

        String Palindrome = "Niagara. 0 roar again!";
        System.out.println(Palindrome.length());
        String extract = Palindrome.substring(11,15);
        System.out.println(extract);



    }
}
