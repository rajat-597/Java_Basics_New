package practice_Collections;

import java.util.ArrayList;
import java.util.List;

public class ListConcepts {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("orange");
        fruits.add("guava");

        System.out.println(fruits); // [Apple, Banana, orange, guava]

        System.out.println(fruits.get(2)); // orange

        fruits.set(3,"Mango");
        System.out.println(fruits); // [Apple, Banana, orange, Mango]

        System.out.println(fruits.contains("Apple")); // true

        System.out.println(fruits.size()); // 4

        System.out.println(fruits.isEmpty()); // false

        System.out.println(fruits.indexOf("orange")); // 2

        System.out.println(fruits.lastIndexOf("Banana")); // 1

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("onion");
        vegetables.add("pumpkins");
        vegetables.add("Banana");

        System.out.println(vegetables); // [Potato, onion, pumpkins, Banana]

        fruits.addAll(vegetables);
        System.out.println(fruits); // [Apple, Banana, orange, Mango, Potato, onion, pumpkins, Banana]

        System.out.println(fruits.lastIndexOf("Banana")); // 7

        System.out.println(fruits.remove(5)); // onion
        System.out.println(fruits.remove("Banana"));  // true

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // clear() -- clear all the element from the lists.
    }
}
