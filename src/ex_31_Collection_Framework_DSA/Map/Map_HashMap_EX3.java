package ex_31_Collection_Framework_DSA.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_HashMap_EX3 {
    public static void main(String[] args) {
        Map <String, Object> student1 = new HashMap<>();
        student1.put("name", "Diwakar");
        student1.put("phone",12345678);
        student1.put("address1", "Banglore");
        student1.put("address2", 560021);

        Map <String, Object> student2 = new HashMap<>();
        student2.put("name", "Lucky");
        student2.put("phone",123456789);
        student2.put("address1", "Delhi");
        student2.put("address2", 345);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

        System.out.println(student1);
    }
}
