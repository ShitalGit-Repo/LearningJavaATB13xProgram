package ex_30_Generics;

import java.util.ArrayList;
import java.util.List;
//List is a collection of items
public class Generic_List {
    public static void main(String[] args) {
        List normallist = new ArrayList();
        normallist.add(10);
        normallist.add("shital");
        normallist.add(true);

        List <Integer> integerList = new ArrayList<>();
        integerList.add(10);

    }
}
