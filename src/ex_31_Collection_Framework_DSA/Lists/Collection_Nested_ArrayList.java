package ex_31_Collection_Framework_DSA.Lists;

import java.util.ArrayList;
import java.util.List;

public class Collection_Nested_ArrayList {
    public static void main(String[] args) {
        List <String> fruit1 = new ArrayList<>();
        fruit1.add("Apple");
        fruit1.add("Orange");
        fruit1.add("Cherry");
        System.out.println(fruit1);

        List vegetable = new ArrayList<>();
        vegetable.add("Onion");
        vegetable.add("Potato");
        vegetable.add("Tomato");
        System.out.println(vegetable);

        List vegetable_fruit = new ArrayList();
        vegetable_fruit.add(fruit1);
        vegetable_fruit.add(vegetable);
        System.out.println(vegetable_fruit);
        System.out.println(vegetable_fruit.get(1));

    }
}
