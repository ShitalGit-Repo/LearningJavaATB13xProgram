package ex_31_Collection_Framework_DSA.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class User_Input_Array_List {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        ArrayList <Integer> ages = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String ContinueInput = "Y";     //control variable fot input loop

        while(ContinueInput.equalsIgnoreCase("Y")){

            System.out.println("Enter the name");
            String name = scanner.next();
            names.add(name);

            System.out.println("Enter the age");
            Integer age = scanner.nextInt();
            ages.add(age);

            scanner.nextLine();
            System.out.println("Do you want to enter another record ?(Y/N):  ");
            ContinueInput = scanner.nextLine();
        }
        for (Object o1:names){
            System.out.println(o1);
        }
        for (Object o2:ages){
            System.out.println(o2);
        }

    }
}
