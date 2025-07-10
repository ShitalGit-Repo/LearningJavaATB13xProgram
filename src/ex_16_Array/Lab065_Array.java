package ex_16_Array;

public class Lab065_Array {
    public static void main(String[] args) {
        int a = 10;
//Array Declaration
        boolean[] married_people = {true, false, true};
        int [] marks1 = {91, 90, 100, 87, 67};  //1st way
        int [] marks2 = new int[5];             //2nd way - size is fix i.e. 5 0-4
        String [] names = new String[3];        //size is fix i.e.3 0-2
        names[0] = "Shital";
        names[1] = "Ankita";
        names[2] = "Kajal";
        System.out.println(marks1.length);
        System.out.println(marks1[0]);
        System.out.println(marks1[4]);
//      System.out.println(marks(10)); - will throw exception error out of array index
        System.out.println(names[0]);

    }
}
