package ex_31_Collection_Framework_DSA.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//you have list of marks and you have to sort out
public class Interview_Question {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

        System.out.println(marks);
        Collections.sort(marks);   //collections is class & collection is interface
        System.out.println(marks);

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
